package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.book.LoginActivity.UID;

public class TestActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    LinearLayout.LayoutParams layoutParams;

    private ArrayList<String[]> mainlist = new ArrayList<String[]>();

    private ArrayList<String> user_get_list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        layoutParams =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);


        Response.Listener<String> stringListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("response :"+ response);
                    JSONObject jsonObject = new JSONObject(response);

                    // DB에 존재하는 스탬프 값 들고 오기
                    JSONArray jsonArray = jsonObject.optJSONArray("stamp_result");
                    System.out.println("제이슨 1 :"+jsonArray.toString());

                    // 사용자가 획득한 스탬프 값 들고 오기
                    JSONArray jsonArray2 = jsonObject.optJSONArray("user_get_result");
                    System.out.println("제이슨2 : "+jsonArray2.toString());

                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject c = jsonArray.getJSONObject(i);
                        mainlist.add(new String[]{c.getString("STEMP_CODE")
                                , c.getString("STEMP_NAME")
                                , c.getString("STEMP_SCORE")});

                    }

                    for(int i=0; i<jsonArray2.length(); i++){
                        JSONObject c = jsonArray2.getJSONObject(i);
                        user_get_list.add(c.getString("STEMP_CODE"));
                    }


                    // 가져온 스탬프 정보들 화면에 띄우기
                    for (int i = 0; i < mainlist.size(); i++) {
                        System.out.println(mainlist.get(i)[0] + mainlist.get(i)[1] + mainlist.get(i)[2]);
                        TextView textView = new TextView(getApplicationContext());
                        textView.setText(mainlist.get(i)[0]+ " " + mainlist.get(i)[1] + " " + mainlist.get(i)[2]);
                        textView.setLayoutParams(layoutParams);

                        // 사용자가 획득한 스탬프는 글자 색상 변경
                        if(user_get_list.contains(mainlist.get(i)[0])){
                            textView.setTextColor(Color.parseColor("#FF6A89"));
                        }

                        linearLayout.addView(textView);
                        setContentView(linearLayout);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        };

        TestRequest testRequest = new TestRequest("20201111", stringListener);
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(testRequest);

    }


    public class TestRequest extends StringRequest {
        // 서버 URL 실행
        final static private String URL = "http://zkwpdlxm.dothome.co.kr/get_STEMP.php";
        private Map<String, String> map;

        public TestRequest(String USER_ID, Response.Listener<String> listener) {
            super(Method.POST, URL, listener, null);

            map = new HashMap<>();
            map.put("USER_ID", USER_ID);
        }

        @Override
        protected Map<String, String> getParams() throws AuthFailureError {
            Log.d(String.valueOf(map), "dfiajifjiaf");
            return map;
        }

    }


}
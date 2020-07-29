package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

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

    ArrayList<JSONObject> arrayJson_test = new ArrayList<JSONObject>();
    ArrayList<JSONObject> arrayJson_score = new ArrayList<JSONObject>();

    String USER_ID = UID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_test);

        //레이아웃 생성
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        //레이아웃 파라미터 생성 layout_width, layout_height
        LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
        );


        final List<String> itemlist_test = new ArrayList<>();

        final List<String> itemlist_score = new ArrayList<>();

        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    //배열 생성
                    final JSONArray jsonArray = new JSONArray();
                    //배열 입력
                    jsonArray.put(jsonObject);

                    for(int k = 0; k < jsonArray.length(); k++){
                        JSONObject tempJson = jsonArray.getJSONObject(k);
                        arrayJson_test.add(tempJson);
                    }

                    JSONObject[] jsons_test = new JSONObject[arrayJson_test.size()];
                    arrayJson_test.toArray(jsons_test);

                    for (int i = 0; i < arrayJson_test.size(); i++) {
                        itemlist_test.add(
                                arrayJson_test.get(i).getString("STAMP_CD") +
                                        arrayJson_test.get(i).getString("STAMP_NAME") );
                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };

        TestRequest testRequest = new TestRequest(USER_ID, responseListener);
        RequestQueue queue = Volley.newRequestQueue(TestActivity.this);
        queue.add(testRequest);




        Response.Listener<String> responseListener2 = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    //배열 생성
                    final JSONArray jsonArray = new JSONArray();
                    //배열 입력
                    jsonArray.put(jsonObject);

                    for(int k = 0; k < jsonArray.length(); k++){
                        JSONObject tempJson = jsonArray.getJSONObject(k);
                        arrayJson_score.add(tempJson);
                    }

                    JSONObject[] jsons = new JSONObject[arrayJson_score.size()];
                    arrayJson_score.toArray(jsons);

                    for (int i = 0; i < arrayJson_score.size(); i++) {
                        itemlist_score.add(
                                arrayJson_score.get(i).getString("STAMP_CD") +
                                        arrayJson_score.get(i).getString("STAMP_NAME") );
                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };

        ScoreRequest scoreRequest = new ScoreRequest(USER_ID, responseListener2);
        RequestQueue queue1 = Volley.newRequestQueue(TestActivity.this);
        queue1.add(scoreRequest);


        TextView[] textView = new TextView[itemlist_score.size()];

        for (int i=0; i<itemlist_score.size(); i++){
            textView[i] = new TextView(this);
            textView[i].setText(itemlist_score.get(i));
            textView[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.circle));
            textView[i].setGravity(Gravity.CENTER);
            textView[i].setLayoutParams(linearLayoutParams);
        }
        //텍스트뷰를 생성한 후 파라미터 설정
//        final TextView test1 = new TextView(this);
//        test1.setText("test");
//        test1.setBackgroundDrawable(getResources().getDrawable(R.drawable.circle));
//        test1.setGravity(Gravity.CENTER);
//        test1.setLayoutParams(linearLayoutParams);
//        test1.setBackgroundDrawable(getResources().getDrawable(R.drawable.blockchain));

        //생성한 텍스트뷰를 레이아웃에 추가
        //linearLayout.addView(test1);

        //화면에 표시 되도록 setContentView 실행
        setContentView(linearLayout);
    }




    public class TestRequest extends StringRequest {
        // 서버 URL 실행
        final static private String URL = "http://yunii23.dothome.co.kr/test.php";
        private Map<String, String> map;

        public TestRequest(String USER_ID, Response.Listener<String> listener){
            super(Method.POST, URL, listener, null);

            map = new HashMap<>();
            map.put("USER_ID", USER_ID);
        }

        @Override
        protected Map<String, String> getParams() throws AuthFailureError {
            Log.d(String.valueOf(map),"dfiajifjiaf");
            return map;
        }

    }


    public class ScoreRequest extends StringRequest {
        // 서버 URL 실행
        final static private String URL = "http://yunii23.dothome.co.kr/score.php";
        private Map<String, String> map;

        public ScoreRequest(String USER_ID, Response.Listener<String> listener){
            super(Method.POST, URL, listener, null);

            map = new HashMap<>();
            map.put("USER_ID", USER_ID);
        }

        @Override
        protected Map<String, String> getParams() throws AuthFailureError {
            Log.d(String.valueOf(map),"dfiddddddddddddddajifjiaf");
            return map;
        }

    }
}
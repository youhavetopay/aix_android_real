package com.example.book.ui.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.book.ActivityActivity;
import com.example.book.CertificateActivity;
import com.example.book.ContestActivity;
import com.example.book.EducationActivity;
import com.example.book.JournalActivity;
import com.example.book.LectureActivity;
import com.example.book.MajorActivity;
import com.example.book.ProjectActivity;
import com.example.book.R;
import com.example.book.TestActivity;
import com.google.android.material.navigation.NavigationView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.example.book.LoginActivity.UID;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    private TextView oval1, oval2, oval3, oval4, oval5, oval6, oval7, oval8, oval9;

    private TextView header_user_name, header_total_score;
    private String user_name;

    ArrayList<JSONObject> arrayJson = new ArrayList<JSONObject>();

    private Context mContext;
    Activity activity;

    private Object OnNamePickerSetListener;
    private OnNamePickerSetListener onNamePickerSetListener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnNamePickerSetListener) {
            onNamePickerSetListener = (OnNamePickerSetListener) context;
        }
        else{
            throw new RuntimeException(context.toString() + "must implement OnNamePickerSetListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        onNamePickerSetListener = null;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final String USER_ID = UID;
        user_name = null;


//        homeViewModel =
//                ViewModelProviders.of(this).get(HomeViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        final TextView text_home = (TextView)root.findViewById(R.id.text_home);


        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("adsfjalskjfalkjfd     "+response);
                    JSONObject jsonObject = new JSONObject(response);
                    //배열 생성
                    final JSONArray jsonArray = new JSONArray();
                    //배열 입력
                    jsonArray.put(jsonObject);

                    for(int k = 0; k < jsonArray.length(); k++){
                        JSONObject tempJson = jsonArray.getJSONObject(k);
                        arrayJson.add(tempJson);
                    }

                    JSONObject[] jsons = new JSONObject[arrayJson.size()];
                    arrayJson.toArray(jsons);

                    text_home.setText(arrayJson.get(0).getString("USER_NAME") + "의 스마일리지");
                    user_name = arrayJson.get(0).getString("USER_NAME");

                    onNamePickerSetListener.onNamePickerSet(user_name);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        HomeFragment.HomeRequest homeRequest = new HomeFragment.HomeRequest(USER_ID, responseListener);
        RequestQueue queue = Volley.newRequestQueue(getActivity());
        queue.add(homeRequest);

        System.out.println("이름;  "+user_name);

        TextView Oval1 = (TextView)root.findViewById(R.id.oval1);
        TextView Oval2 = (TextView)root.findViewById(R.id.oval2);
        TextView Oval3 = (TextView)root.findViewById(R.id.oval3);
        TextView Oval4 = (TextView)root.findViewById(R.id.oval4);
        TextView Oval5 = (TextView)root.findViewById(R.id.oval5);
        TextView Oval6 = (TextView)root.findViewById(R.id.oval6);
        TextView Oval7 = (TextView)root.findViewById(R.id.oval7);
        TextView Oval8 = (TextView)root.findViewById(R.id.oval8);
        TextView Oval9 = (TextView)root.findViewById(R.id.oval9);

        //경진대회
        Oval1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ContestActivity.class);
                intent.putExtra("user_name",user_name);
                startActivity(intent);
            }
        });

        //활동
        Oval2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ActivityActivity.class);
                intent.putExtra("user_name",user_name);
                startActivity(intent);
            }
        });

        //특강
        Oval3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LectureActivity.class);
                intent.putExtra("user_name",user_name);
                startActivity(intent);
            }
        });

        //자격증
        Oval4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CertificateActivity.class);
                intent.putExtra("user_name",user_name);
                startActivity(intent);
            }
        });

        //교육
        Oval5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EducationActivity.class);
                intent.putExtra("user_name",user_name);
                startActivity(intent);
            }
        });

        //프로젝트 및 봉사
        Oval6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProjectActivity.class);
                intent.putExtra("user_name",user_name);
                startActivity(intent);
            }
        });

        //융합연계전공 및 연구활동
        Oval7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MajorActivity.class);
                intent.putExtra("user_name",user_name);
                startActivity(intent);
            }
        });

        //논문 및 홍보, 모집
        Oval8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), JournalActivity.class);
                intent.putExtra("user_name",user_name);
                startActivity(intent);
            }
        });


        //테스트
        Oval9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TestActivity.class);
                intent.putExtra("user_name",user_name);
                startActivity(intent);
            }
        });

        //이미지뷰 테스트


        return root;
    }

    public interface OnNamePickerSetListener{
        void onNamePickerSet(String name);
    }




    public class HomeRequest extends StringRequest {
        // 서버 URL 실행
        final static private String URL = "http://yunii23.dothome.co.kr/myname.php";
        private Map<String, String> map;

        public HomeRequest(String USER_ID, Response.Listener<String> listener){
            super(Method.POST, URL, listener, null);

            map = new HashMap<>();
            map.put("USER_ID", USER_ID);
        }

        @Override
        protected Map<String, String> getParams() throws AuthFailureError {
            Log.d(String.valueOf(map),"dfiaj22222222ifjiaf");
            return map;
        }

    }
}
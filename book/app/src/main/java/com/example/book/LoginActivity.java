package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    private EditText et_id, et_password;
    private Button btn_login;
    public static String UID;


    /**
     * 아이디 moon
     * 비밀벊호 moon12
     * **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_id = findViewById(R.id.et_id);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);


        // 로그인 클릭시 아이디 비번 값 확인 후 yes면 메인으로 넘김
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // EditText에 현재 입력되어있는 값을 get(가져오다)해온다.
                String USER_ID = et_id.getText().toString();
                String USER_PW = et_password.getText().toString();

                //response 디비로 보냄
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            System.out.println("login  "+response);
                            JSONObject jsonObject = new JSONObject(response);
                            boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                String USER_ID = jsonObject.getString("USER_ID");
                                String USER_PW = jsonObject.getString("USER_PW"); //php
                                UID = USER_ID;

                                Toast.makeText(getApplicationContext(), "로그인에 성공하셨습니다.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                intent.putExtra("USER_ID", USER_ID);
                                et_id.setText("");
                                et_password.setText("");
                                startActivity(intent);

                            } else { // 회원등록에 실패할 경우
                                Toast.makeText(getApplicationContext(), "로그인에 실패하셨습니다.", Toast.LENGTH_LONG).show();
                                return;
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };
                LoginActivity.LoginRequest loginRequest = new LoginActivity.LoginRequest(USER_ID, USER_PW, responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);
            }
        });
    }




    public class LoginRequest extends StringRequest {
        // 서버 URL 실행
        final static private String URL = "http://yunii23.dothome.co.kr/bookLogin.php";
        private Map<String, String> map;

        public LoginRequest(String USER_ID, String USER_PW, Response.Listener<String> listener){
            super(Method.POST, URL, listener, null);

            map = new HashMap<>();
            map.put("USER_ID", USER_ID);
            map.put("USER_PW", USER_PW);
        }

        @Override
        protected Map<String, String> getParams() throws AuthFailureError {
            return map;
        }

    }

}
package com.example.apple.invision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button forgot_password = (Button) findViewById(R.id.fgt_pwd);
        forgot_password.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"Forgot Password",Toast.LENGTH_SHORT).show();
            }
        });

        Button sign_in = (Button) findViewById(R.id.btn1);
        sign_in.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"Sign In",Toast.LENGTH_SHORT).show();
            }
        });

       Button sign_up = (Button) findViewById(R.id.btn2);
        sign_up.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                Toast.makeText(MainActivity.this,"Sign Up",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

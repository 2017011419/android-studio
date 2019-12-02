package com.example.myapplication1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_tishi,btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_tishi=(Button)findViewById(R.id.btn_tishi);
        btn_login=(Button)findViewById(R.id.btn_login);
        btn_tishi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btn_tishi:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                        dialog.setTitle("This is a dialog");
                        dialog.setMessage("Something important.");
                        dialog.setCancelable(false);
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {

                            }
                        });
                        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;


                }

            }
        });
        btn_login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("请输入用户名和密码");
                View v = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog,null);
                builder.setView(v);
                final EditText username = (EditText)v.findViewById(R.id.username);
                final EditText password = (EditText)v.findViewById(R.id.password);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String a = username.getText().toString().trim();
                        String b = password.getText().toString().trim();
                        if(a.equals("abc") && b.equals("123"))
                            Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(MainActivity.this,"登陆失败",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });

    }
}

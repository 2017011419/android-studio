package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = "Hello,SecondActivity";
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("extra_data",data);
                startActivityForResult(intent,1);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,@Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Toast.makeText(this,"Hello,SecondActivity",Toast.LENGTH_LONG).show();
                }
                break;
            default:
        }
    }
}

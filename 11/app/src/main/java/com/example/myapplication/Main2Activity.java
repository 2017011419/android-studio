package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button2=(Button)findViewById(R.id.button_2);
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("Main2Activity",data);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("data_rerurn","Hello,FirstActivity");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}

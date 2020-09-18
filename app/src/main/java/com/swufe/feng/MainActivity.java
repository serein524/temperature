package com.swufe.feng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//加载放在操作之前

        tv = findViewById(R.id.tv1);
        tv.setText("输入摄氏温度：");
        Button btn = findViewById(R.id.b1);

        //btn.setOnClickListener(new View.onClickListener());
    }

    public void bt(View v) {
        Log.i("main","onClick msg");
        EditText et = findViewById(R.id.ed1);
        String st = et.getText().toString();
        float c = Float.parseFloat(st);
        float f = c*9/5+32;
        String re = ""+f;
        tv.setText(re);
    }
}
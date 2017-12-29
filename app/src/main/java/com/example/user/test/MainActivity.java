package com.example.user.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{
    private int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.text);
                counter++;
                tv.setText(Integer.toString(counter));
            }
        });
        findViewById(R.id.button4).setOnClickListener(onClickListener);
        findViewById(R.id.button5).setOnClickListener(new HandleClick());
    }

    private class HandleClick implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            TextView tv = (TextView)findViewById(R.id.text);
            counter++;
            tv.setText(Integer.toString(counter));
        }
    }


    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView tv = (TextView)findViewById(R.id.text);
            counter++;
            tv.setText(Integer.toString(counter));
        }
    };
    public void btClick(View view){
        TextView tv = (TextView)findViewById(R.id.text);
        counter++;
        tv.setText(Integer.toString(counter));
    }

    public void onClick(View view){
        TextView tv = (TextView)findViewById(R.id.text);
        counter++;
        tv.setText(Integer.toString(counter));
    }

}
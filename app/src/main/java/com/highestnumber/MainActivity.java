package com.highestnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button btnFirst, btnSecond;
    public TextView tvOutput;
    int start = 0;
    public static int first;
    public static int second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFirst = findViewById(R.id.btnFirst);
        btnSecond = findViewById(R.id.btnSecond);
        tvOutput = findViewById(R.id.tvOutput);



        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HighestActivity ha = new HighestActivity();
                first = ha.generateFirst();
                second = ha.generateSecond();
                btnFirst.setText(Integer.toString(first));
                btnSecond.setText(Integer.toString(second));
                if(first>second){
                    start++;

                }
                if(second>first){
                    start--;

                }
                tvOutput.setText(Integer.toString(start));
            }

        });
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HighestActivity ha = new HighestActivity();

               first = ha.generateFirst();
               second = ha.generateSecond();
                btnFirst.setText(Integer.toString(first));
                btnSecond.setText(Integer.toString(second));
                if(first>second){
                    start--;
                }
                if(second>first){
                    start++;
                }
                tvOutput.setText(Integer.toString(start));

            }
        });
    }
}

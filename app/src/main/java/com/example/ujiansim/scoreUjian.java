package com.example.ujiansim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class scoreUjian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_ujian);

        final TextView txt = (TextView) findViewById(R.id.textView7);
        final TextView txt6 = (TextView) findViewById(R.id.textView6);

        txt.setText(getIntent().getStringExtra("sim2"));
        txt6.setText(getIntent().getStringExtra("score"));

        Button btn2 = (Button) findViewById(R.id.button8);
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(scoreUjian.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}

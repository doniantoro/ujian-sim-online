package com.example.ujiansim;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class jenis_ujian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_ujian);
        Button btn2 = (Button) findViewById(R.id.button6);
        Button btn3 = (Button) findViewById(R.id.button7);
        final TextView txt = (TextView) findViewById(R.id.textView2);

        //give result of variable txt from value of sim
        txt.setText(getIntent().getStringExtra("sim"));

        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(jenis_ujian.this,alertUjianTheory.class);
                //Give value to object sim and sim 2 from last class
                i.putExtra("sim", getIntent().getStringExtra("sim"));
                i.putExtra("sim2", getIntent().getStringExtra("sim2"));
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse(getIntent().getStringExtra("link")));
                startActivity(i);
            }
        });

    }
}

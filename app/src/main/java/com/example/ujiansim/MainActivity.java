package com.example.ujiansim;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("sim", "Ujian SIM C".toString());
                bundle.putString("sim2", "SIM C".toString());
                Intent intent = new Intent(MainActivity.this, jenis_ujian.class);
                bundle.putString("link", "https://www.youtube.com/watch?v=-b6pOnfTTvU".toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("sim", "Ujian SIM B".toString());
                bundle.putString("sim2", "SIM B".toString());
                bundle.putString("link", "https://www.youtube.com/watch?v=Z7Mp90GsrEk".toString());
                Intent intent = new Intent(MainActivity.this, jenis_ujian.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, jenis_ujian.class);
                intent.putExtra("sim", "Ujian SIM A".toString());
                intent.putExtra("sim2", "SIM A".toString());
                intent.putExtra("link", "https://www.youtube.com/watch?v=v0CsUO2Wm9M".toString());
                startActivity(intent);
            }
        });

    }

}

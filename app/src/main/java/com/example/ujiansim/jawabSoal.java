package com.example.ujiansim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class jawabSoal extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    private Button btn ;
    RadioButton radio,radio2,radio3;
    private RadioButton kirim;
    private RadioGroup grub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawab_soal);


        dbHelper = new DataHelper(this);
        radio = (RadioButton) findViewById(R.id.radioButton);
        radio2 = (RadioButton) findViewById(R.id.radioButton2);
        radio3 = (RadioButton) findViewById(R.id.radioButton3);
        TextView soal = (TextView) findViewById(R.id.textView9);
        grub = (RadioGroup) findViewById(R.id.grub);
        btn = (Button) findViewById(R.id.button5);

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM soalUjian WHERE soal = '" +
                getIntent().getStringExtra("soal") + "'",null);
        cursor.moveToFirst();
        if (cursor.getCount()>0)
        {
            cursor.moveToPosition(0);
            soal.setText(cursor.getString(2).toString());
            radio.setText(cursor.getString(3).toString());
            radio2.setText(cursor.getString(4).toString());
            radio3.setText(cursor.getString(5).toString());

        }

    addListenerOnButton();

}

public void addListenerOnButton() {

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // get selected radio button from radioGroup
            int selectedId = grub.getCheckedRadioButtonId();

            // find the radiobutton by returned id
            kirim = (RadioButton) findViewById(selectedId);

            Intent i = new Intent(jawabSoal.this,ujianTheory.class);
            i.putExtra("paramSoal", cursor.getString(2).toString());
            i.putExtra("sim2", getIntent().getStringExtra("sim2"));
            i.putExtra("jawab", kirim.getText());
            startActivity(i);

        }


    });

        }
}

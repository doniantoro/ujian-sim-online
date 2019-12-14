package com.example.ujiansim;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ujianTheory extends AppCompatActivity {
    String[] daftar;
    ListView ListView01;
    protected Cursor cursor;
    DataHelper dbcenter;
    public static ujianTheory ma;
    private Button submit;
    int i = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ujian_theory);


        ma = this;
        dbcenter = new DataHelper(this);
        RefreshList();

        submit(i);


    }


    public void RefreshList(){
        SQLiteDatabase db = dbcenter.getReadableDatabase();//intialitation and make object db
        cursor = db.rawQuery("SELECT * FROM soalUjian ",null);//query of db
        daftar = new String[cursor.getCount()];//get how many data in db
        cursor.moveToFirst(); //move to first

        //looping procces
        for (int cc=0; cc < cursor.getCount(); cc++)
        {
            cursor.moveToPosition(cc);
            //get data from db
            daftar[cc] = cursor.getString(2).toString();
            //Hitung score
            if (cursor.getString(2).toString()==getIntent().getStringExtra("paramSoal")) {
                if (cursor.getString(6).toString() == getIntent().getStringExtra("jawab")) {
                    i = i + 4;
                } } }

        ListView01 = (ListView)findViewById(R.id.listView1);//initialitation
        ListView01.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));//set adapter l
        ListView01.setSelected(true);//permit to selected
        //function if clicked
        ListView01.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {

                final String selection = daftar[arg2]; //.getItemAtPosition(arg2).toString();

                Intent i = new Intent(getApplicationContext(), jawabSoal.class);
                i.putExtra("soal", selection);
                i.putExtra("sim2", getIntent().getStringExtra("sim2"));
                startActivity(i);

            }});
        ((ArrayAdapter)ListView01.getAdapter()).notifyDataSetInvalidated();
    }



    public void submit(int i)
    {
        final String s=String.valueOf(i);
        submit =(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(ujianTheory.this,scoreUjian.class);
                i.putExtra("score", s.toString());
                i.putExtra("sim2", getIntent().getStringExtra("sim2"));
                startActivity(i);

            }
        });
    }

}
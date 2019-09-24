package com.example.student.bai3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<String>myList;
private ArrayAdapter<String>adapter;
private ListView list;
Button btn_nhap;
EditText et_1;
TextView tv_kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_1=(EditText)findViewById(R.id.editText_1);
        myList= new ArrayList<String>();
        list=(ListView)findViewById(R.id.lv_danhsach);
        adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myList);
        list.setAdapter(adapter);
        btn_nhap=(Button)findViewById(R.id.button_nhap);
        btn_nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                myList.add(et_1.getText()+"");
                adapter.notifyDataSetChanged();

            }

        });
     tv_kq=(TextView)findViewById(R.id.textView_kq);
     list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
             String msg="postion:"+arg2;
             msg +=";value :="+arg0.getItemAtPosition(arg2).toString();
             tv_kq.setText(msg);
         }
     });


    }
}

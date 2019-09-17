package com.example.nhapttcanhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edithoten, editcmnd, editbosung;
    Button btngui;
    RadioGroup radioGr;
    RadioButton radio_tc, radio_cd, radio_dh;
    CheckBox checkBox_db, checkBox_ds, checkBox_dc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngui=(Button)findViewById(R.id.button_gui);
        edithoten=(EditText)findViewById(R.id.editText_hoten);
        editcmnd=(EditText)findViewById(R.id.editText_cmnd);
        editbosung=(EditText)findViewById(R.id.editText_bosung);
        radioGr=(RadioGroup)findViewById(R.id.radio_gr);
        radio_tc=(RadioButton)findViewById(R.id.radio_tc);
        radio_cd=(RadioButton)findViewById(R.id.radio_cd);
        radio_dh=(RadioButton)findViewById(R.id.radio_dh);
        checkBox_db=(CheckBox)findViewById(R.id.checkBox_db);
        checkBox_ds=(CheckBox)findViewById(R.id.checkBox_ds);
        checkBox_dc=(CheckBox)findViewById(R.id.checkBox_dc);
        radio_tc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this,"Đã chọn Trung cấp", Toast.LENGTH_SHORT).show();
                }
            }
        });
        radio_cd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this,"Đã chọn Cao đẳng", Toast.LENGTH_SHORT).show();
                }
            }
        });
        radio_dh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this,"Đã chọn Đại học", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox_db.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this,"Đã chọn đọc báo", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Đã bỏ chọn đọc báo",Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox_ds.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this,"Đã chọn đọc sách", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Đã bỏ chọn đọc sách",Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox_dc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this,"Đã chọn đọc coding", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Đã bỏ chọn đọc coding",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btngui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Đã gửi thông tin",Toast.LENGTH_SHORT).show();
                edithoten.setText("");
                editcmnd.setText("");
                editbosung.setText("");
                radioGr.clearCheck();

            }

        });
    }
}

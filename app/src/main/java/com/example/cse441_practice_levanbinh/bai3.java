package com.example.cse441_practice_levanbinh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class bai3 extends AppCompatActivity {
    // Khai bao cac bien giao dien
    EditText edt_ls3_NumberA,edt_ls3_NumberB,edt_ls3_Resuil;
    Button bt_ls3_Tong,bt_ls3_Hieu,bt_ls3_Tich,bt_ls3_Thuong,bt_ls3_BackMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai3);
        edt_ls3_NumberA = findViewById(R.id.edt_ls3_NumberA);
        edt_ls3_NumberB = findViewById(R.id.edt_ls3_NumberB);
        edt_ls3_Resuil = findViewById(R.id.edt_ls3_Resuil);
        bt_ls3_Tong = findViewById(R.id.bt_ls3_Tong);
        bt_ls3_Hieu = findViewById(R.id.bt_ls3_Hieu);
        bt_ls3_Tich = findViewById(R.id.bt_ls3_Tich);
        bt_ls3_Thuong = findViewById(R.id.bt_ls3_Thuong);
        bt_ls3_BackMain = findViewById(R.id.bt_ls3_BackMain);

        bt_ls3_Tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0"+edt_ls3_NumberA.getText());
                int b = Integer.parseInt("0"+edt_ls3_NumberB.getText());
                edt_ls3_Resuil.setText("a + b = "+(a+b));

            }
        });
        bt_ls3_Hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0"+edt_ls3_NumberA.getText());
                int b = Integer.parseInt("0"+edt_ls3_NumberB.getText());
                edt_ls3_Resuil.setText("a - b = "+(a-b));

            }
        });
        bt_ls3_Tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0"+edt_ls3_NumberA.getText());
                int b = Integer.parseInt("0"+edt_ls3_NumberB.getText());
                edt_ls3_Resuil.setText("a * b = "+(a*b));

            }
        });
        bt_ls3_Thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0"+edt_ls3_NumberA.getText().toString());
                int b = Integer.parseInt("0"+edt_ls3_NumberB.getText().toString());
                edt_ls3_Resuil.setText("a / b = "+(a/b));

            }
        });
        bt_ls3_BackMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_ls3_BackHome = new Intent(bai3.this,MainActivity.class);
                startActivity(intent_ls3_BackHome);
            }
        });

    }
}
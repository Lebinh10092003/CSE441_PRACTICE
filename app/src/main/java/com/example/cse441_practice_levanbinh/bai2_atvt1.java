package com.example.cse441_practice_levanbinh;

import static com.example.cse441_practice_levanbinh.R.id.bt_Call_Dialog_b2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class bai2_atvt1 extends AppCompatActivity {
    // Khai bao bien giao dien
    Button bt_Call_Dialog_b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai2_atvt1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bt_Call_Dialog_b2 = findViewById(R.id.bt_Call_Dialog_b2);
        bt_Call_Dialog_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_bai2_1 = new Intent(bai2_atvt1.this, bai2_atvt2.class);
                startActivity(intent_bai2_1);
            }
        });
    }
}
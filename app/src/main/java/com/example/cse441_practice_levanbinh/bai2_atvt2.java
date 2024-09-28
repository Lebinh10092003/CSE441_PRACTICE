package com.example.cse441_practice_levanbinh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class bai2_atvt2 extends AppCompatActivity {
    //Khai báo biến giao diện
    Button bt_Ok_b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai2_atvt2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bt_Ok_b2 = findViewById(R.id.bt_Ok_b2);
        bt_Ok_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intnet_b2_BackMain = new Intent(bai2_atvt2.this,MainActivity.class);
                startActivity(intnet_b2_BackMain);
                // Neu muon tro ve Activity truoc thi dung ham finish()
                //finish();
            }
        });
    }
}
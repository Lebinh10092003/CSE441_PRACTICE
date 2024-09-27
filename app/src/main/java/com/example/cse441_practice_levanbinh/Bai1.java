package com.example.cse441_practice_levanbinh;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Bai1 extends AppCompatActivity {
    // Khai báo các biến giao diện
    Button bt_Sum;
    EditText edt_A , edt_B,edt_Sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bt_Sum = findViewById(R.id.bt_Sum);
        edt_A = findViewById(R.id.edt_NumberA);
        edt_B = findViewById(R.id.edt_NumberB);
        edt_Sum = findViewById(R.id.edt_Sum);
        bt_Sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edt_A.getText().toString());
                int b = Integer.parseInt(edt_B.getText().toString());
                int sum = a + b;
                edt_Sum.setText(sum + "");
            }
        });

    }
}
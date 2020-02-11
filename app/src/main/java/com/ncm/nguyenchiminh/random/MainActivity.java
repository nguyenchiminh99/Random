package com.ncm.nguyenchiminh.random;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvNumber;
    Button btn;
    EditText edt1, edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                String chuoi1 = edt1.getText().toString().trim();
                String chuoi2 = edt2.getText().toString().trim();
                if (chuoi1.length() == 0 || chuoi2.length() == 0) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ số!", Toast.LENGTH_SHORT).show();
                } else {
                    int min = Integer.parseInt(chuoi1);
                    int max = Integer.parseInt(chuoi2);
                    int number = random.nextInt(max - min + 1) + min;
                    tvNumber.setText(number + "");
                }

            }
        });
    }

    private void AnhXa() {
        tvNumber = (TextView) findViewById(R.id.tvNumber);
        btn = (Button) findViewById(R.id.btn);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
    }
}

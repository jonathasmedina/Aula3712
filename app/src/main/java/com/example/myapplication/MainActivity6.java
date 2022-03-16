package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    RadioGroup radioGroup_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        radioGroup_ = findViewById(R.id.radioGroup2);

        radioGroup_.setOnCheckedChangeListener(mOuvinte);

    }
    RadioGroup.OnCheckedChangeListener mOuvinte = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId){
                case R.id.radioButton1_:
                    Toast.makeText(getApplicationContext(), "Primeira opção", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioButton2_:
                    Toast.makeText(getApplicationContext(), "Segunda opção", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioButton3_:
                    Toast.makeText(getApplicationContext(), "Terceira opção", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioButton4_:
                    Toast.makeText(getApplicationContext(), "Quarta opção", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}
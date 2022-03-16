package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    Button bt1;
    RadioGroup radioGroup1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        bt1 = findViewById(R.id.buttonRadio);
        radioGroup1 = findViewById(R.id.radioGroup);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (radioGroup1.getCheckedRadioButtonId()){
                    case R.id.radioButton1:
                        Intent intent = new Intent(MainActivity5.this, MainActivity.class);

                        String nome = "IFMS";

                        intent.putExtra("nome123", nome);

                        startActivity(intent);
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(getApplicationContext(), "Segundo selecionado",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(getApplicationContext(), "Terceiro selecionado",
                                Toast.LENGTH_SHORT).show();
                        break;


                }
            }
        });
    }
}
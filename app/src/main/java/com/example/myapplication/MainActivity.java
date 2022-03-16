package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView);
        ed1 = findViewById(R.id.editTextCampoUm);

        Intent intent_ = getIntent();

        String nomeRecebido = (String) intent_.getSerializableExtra("nome123");
        Toast.makeText(this, nomeRecebido, Toast.LENGTH_SHORT).show();

    }

    public void funcao(View v){
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
        finish();

        if(ed1.getText().toString().equalsIgnoreCase("")){
            Log.e("Dentro função", "texto");
            ed1.setError("Preencha.");
        }
        else
        {
        int valor1 = Integer.parseInt(ed1.getText().toString());
        tv1.setText("Texto digitado: " + valor1);
        }
    }
}


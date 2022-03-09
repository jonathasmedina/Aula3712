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

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    private EditText editTextNum1_;
    private EditText editTextNum2_;
    private TextView textView_;
    private Button btSomar_, btSubtrair_, btDividir_, btMultiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTextNum1_ = findViewById(R.id.editTextNum1);
        editTextNum2_ = findViewById(R.id.editTextNum2);
        textView_ = findViewById(R.id.textViewResult);
        btSomar_ = findViewById(R.id.buttonSomar);
        btDividir_ = findViewById(R.id.buttonDiv);
        btMultiplicar = findViewById(R.id.buttonMult);
        btSubtrair_ = findViewById(R.id.buttonSubtrair);

        //forma 1
        btSomar_.setOnClickListener(ouvinte);

        //forma 2
        btSubtrair_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(editTextNum1_.getText().toString());
                int n2 = Integer.parseInt(editTextNum2_.getText().toString());

                int result = n1 - n2;
                Log.e("msg1","dentro da função oncreate()");

                textView_.setText(String.valueOf(result));
            }
        });

        //forma 3
        btMultiplicar.setOnClickListener(this);

        //forma 4 - com função no onClick
    }

    public void funcao(View v){

        //Toast
        Toast.makeText(this, "Mensagem 1",
                Toast.LENGTH_SHORT).show();

        //Botão resetar formulário
        editTextNum2_.setText("");

        //mudar de tela
        Intent intent = new Intent(
                MainActivity2.this,
                MainActivity.class
        );
        startActivity(intent);

        //mensagem no log:
        Log.e("msg1","dentro da função oncreate()");


        //


        int n1 = Integer.parseInt(editTextNum1_.getText().toString());
        int n2 = Integer.parseInt(editTextNum2_.getText().toString());

        int result = n1 / n2;

        textView_.setText(String.valueOf(result));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonDiv:
                //
                break;
            case R.id.buttonSomar:
                //
                break;
        }


        int n1 = Integer.parseInt(editTextNum1_.getText().toString());
        int n2 = Integer.parseInt(editTextNum2_.getText().toString());

        int result = n1 * n2;

        textView_.setText(String.valueOf(result));
    }


   View.OnClickListener ouvinte = new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           int n1 = Integer.parseInt(editTextNum1_.getText().toString());
           int n2 = Integer.parseInt(editTextNum2_.getText().toString());

           int result = n1 + n2;

           textView_.setText(String.valueOf(result));
       }
   };


}
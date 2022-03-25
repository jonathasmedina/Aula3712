package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity7 extends AppCompatActivity {

    private CheckBox ck1, ck2, ck3;
    private Button bt1;
    private Spinner spinner;
    private Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        ck1 = findViewById(R.id.checkBox);
        ck2 = findViewById(R.id.checkBox2);
        ck3 = findViewById(R.id.checkBox3);
        bt1 = findViewById(R.id.button3);
        spinner = findViewById(R.id.spinner_);
        aSwitch = findViewById(R.id.switch2);

        //ouvinte do button para verificar checkbox marcado
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ck2.isChecked())
                    Toast.makeText(getApplicationContext(),
                            "CheckBox 2 marcado", Toast.LENGTH_SHORT).show();
            }
        });

        //ouvinte de um checkbox
        ck3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ck3.isChecked())
                    Toast.makeText(getApplicationContext(),
                            "CheckBox 3 marcado", Toast.LENGTH_SHORT).show();
            }
        });

        //ouvinte switch
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    Log.e("Estado do switch: ", "" + isChecked);
            }
        });


        ArrayList<String> arrayListSpinner = new ArrayList<>();
        arrayListSpinner.add("Opção 1");
        arrayListSpinner.add("Opção 2");
        arrayListSpinner.add("Opção 3");
        arrayListSpinner.add("Opção 4");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                R.layout.meuspinner,
                arrayListSpinner
        );

        spinner.setAdapter(arrayAdapter);
        spinner.setSelection(0, false);

        //ouvinte spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selec = spinner.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(), selec, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //
            }
        });


    }
}
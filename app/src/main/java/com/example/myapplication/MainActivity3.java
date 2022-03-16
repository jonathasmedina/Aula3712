package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity3 extends ListActivity {

    String[] CORES = new String[] {"Tela 1",
            "Tela Calculadora",
            "Janela de Diálogo",
            "RadioGroup sem listener",
            "RadioGroup com listener",
    };
    ArrayAdapter<String> meuArrayAdapter;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        meuArrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, CORES);

        setListAdapter(meuArrayAdapter);

        registerForContextMenu(getListView());
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if(position == 0){
            i = new Intent(MainActivity3.this, MainActivity.class);
            startActivity(i);
            finish();
        }
        if(position == 1){
            i = new Intent(MainActivity3.this, MainActivity2.class);
            startActivity(i);
            finish();
        }
        if(position == 2){
            AlertDialog.Builder janela = new AlertDialog.Builder(this);
            janela.setTitle("Alterar Tela");
            janela.setMessage("Deseja Alterar Tela?");
            //janela.setNeutralButton("Ok", null);
            janela.setPositiveButton("Ok", ouvinteJanela);
            janela.setNegativeButton("Cancelar", null);
            janela.show();
        }
        if(position == 3){
            i = new Intent(MainActivity3.this, MainActivity5.class);
            startActivity(i);
        }
        if(position == 4){
            i = new Intent(MainActivity3.this, MainActivity6.class);
            startActivity(i);
        }

    }
    DialogInterface.OnClickListener ouvinteJanela = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
         Intent intent = new Intent(MainActivity3.this, MainActivity4.class );
         startActivity(intent);
        }
    };
}
package com.example.user.metrorevisorapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class EscolherEstacao extends Activity {
    String estacao = "Estadio do Dragao";
    String linha = "A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher_estacao);

        Button btn_ok_estacao = (Button) findViewById(R.id.btn_ok_estacao);
        btn_ok_estacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), ObservarEstacao.class);
                startIntent.putExtra("com.example.user.metrorevisorapp.ESTACAO", estacao);
                startIntent.putExtra("com.example.user.metrorevisorapp.LINHA", linha);
                startActivity(startIntent);

            }
        });

        //Linhas
        Spinner spn_linha = (Spinner) findViewById(R.id.spn_linha);
        String[] id_linhas = getResources().getStringArray(R.array.Linha_comboio);
        //public String[] id_estacao = getResources().getStringArray(R.array.A1)
        ArrayAdapter<String> adapter_linha = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, id_linhas);
        spn_linha.setAdapter(adapter_linha);
        spn_linha.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] id_estacao = getResources().getStringArray(R.array.A1);
                switch(position){
                    case 0:
                        id_estacao = getResources().getStringArray(R.array.A1);
                        run(id_estacao,"A");
                        break;
                    case 1:
                        id_estacao = getResources().getStringArray(R.array.B1);
                        run(id_estacao,"B");
                        break;
                    case 2:
                        id_estacao = getResources().getStringArray(R.array.C1);
                        run(id_estacao,"C");
                        break;
                    case 3:
                        id_estacao = getResources().getStringArray(R.array.D1);
                        run(id_estacao,"D");
                        break;
                    case 4:
                        id_estacao = getResources().getStringArray(R.array.E1);
                        run(id_estacao,"E");
                        break;
                    case 5:
                        id_estacao = getResources().getStringArray(R.array.F1);
                        run(id_estacao, "F");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    public void run(final String[] lista, final String _linha){
        Spinner spn_estacao = (Spinner) findViewById(R.id.spn_estacao);
        ArrayAdapter<String> adapter_estacao = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista);
        spn_estacao.setAdapter(adapter_estacao);
        spn_estacao.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                estacao = lista[position];
                linha = _linha;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

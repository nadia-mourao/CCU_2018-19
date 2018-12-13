package com.example.user.metrorevisorapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ObservarEstacao extends AppCompatActivity {
    String estacao, linha;
    ListView myListView;
    String[] id_comboios, est_seg, linhas, sentidos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observar_estacao);

        estacao = getIntent().getStringExtra("om.example.user.metrorevisorapp.ESTACAO");
        linha = getIntent().getStringExtra("om.example.user.metrorevisorapp.LINHA");

        TextView tv_id = (TextView) findViewById(R.id.tv_ID);
        tv_id.setText(estacao);

        TextView tv_sentido_1 = (TextView) findViewById(R.id.tv_sentido_1);
        TextView tv_sentido_2 = (TextView) findViewById(R.id.tv_sentido_2);
        TextView tv_sentido_3 = (TextView) findViewById(R.id.tv_sentido_3);
        selectSentido(tv_sentido_1);
        selectSentido(tv_sentido_2);
        selectSentido(tv_sentido_3);

        Resources res = getResources();

        id_comboios = res.getStringArray(R.array.ID);
        est_seg = res.getStringArray(R.array.Estacao_seguinte);
        linhas = res.getStringArray(R.array.Linhas);
        sentidos = res.getStringArray(R.array.Sentidos);

        TextView tv_minuto_1 = (TextView) findViewById(R.id.tv_minutos_1);
        tv_minuto_1.setText("3 min");

        TextView tv_minuto_2 = (TextView) findViewById(R.id.tv_minutos_2);
        tv_minuto_1.setText("5 min");

        TextView tv_minuto_3 = (TextView) findViewById(R.id.tv_minutos_3);
        tv_minuto_1.setText("6 min");

        Button btn_ver_estacao = (Button) findViewById(R.id.btn_ver_estacao);
        btn_ver_estacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), ImagemEstacao.class);
                startActivity(startIntent);

            }
        });
    }

    public void selectSentido (TextView str_sentido){
        java.util.Random random = new java.util.Random();
        int index = random.nextInt(2);
        String sentido_aux = linha + (index+1) + "";

        if ((sentido_aux.equals("A1"))){
            str_sentido.setText("Estadio do Dragao - Senhor de Matosinhos");
            str_sentido.setTextColor(Color.BLUE);
        }
        else if ((sentido_aux.equals("B1"))){
            str_sentido.setText("Estadio do Dragao - Povoa de Varzim");
            str_sentido.setTextColor(Color.RED);
        }
        else if ((sentido_aux.equals("C1"))){
            str_sentido.setText("Campanha - ISMAI");
            str_sentido.setTextColor(Color.parseColor("#32CD32"));
        }
        else if ((sentido_aux.equals("D1")) ){
            str_sentido.setText("Hospital Sao Joao - Santo Ovidio");
            str_sentido.setTextColor(Color.parseColor("#cdb403"));
        }
        else if ((sentido_aux.equals("E1"))){
            str_sentido.setText("Estadio do Dragao - Aeroporto");
            str_sentido.setTextColor(Color.parseColor("#4B0082"));
        }
        else if ((sentido_aux.equals("F1"))){
            str_sentido.setText("Senhora da Hora - Fazeres");
            str_sentido.setTextColor(Color.parseColor("#FF8C00"));
        }
        else if ((sentido_aux.equals("A2"))){
            str_sentido.setText("Estadio do Dragao - Senhor de Matosinhos");
            str_sentido.setTextColor(Color.BLUE);
        }
        else if ((sentido_aux.equals("B2"))){
            str_sentido.setText("Estadio do Dragao - Povoa de Varzim");
            str_sentido.setTextColor(Color.RED);
        }
        else if ((sentido_aux.equals("C2"))){
            str_sentido.setText("Campanha - ISMAI");
            str_sentido.setTextColor(Color.parseColor("#32CD32"));
        }
        else if ((sentido_aux.equals("D2")) ){
            str_sentido.setText("Hospital Sao Joao - Santo Ovidio");
            str_sentido.setTextColor(Color.parseColor("#cdb403"));
        }
        else if ((sentido_aux.equals("E2"))){
            str_sentido.setText("Estadio do Dragao - Aeroporto");
            str_sentido.setTextColor(Color.parseColor("#4B0082"));
        }
        else if ((sentido_aux.equals("F2"))){
            str_sentido.setText("Senhora da Hora - Fazeres");
            str_sentido.setTextColor(Color.parseColor("#FF8C00"));
        }
    }
}

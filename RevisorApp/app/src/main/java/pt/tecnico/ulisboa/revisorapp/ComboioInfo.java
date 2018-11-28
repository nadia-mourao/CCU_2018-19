package pt.tecnico.ulisboa.revisorapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

public class ComboioInfo extends AppCompatActivity {
    ListView myListView;
    String[] id_comboios, est_seg, linhas, sentidos, estacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comboio_info);
        Intent in = getIntent();
        int index = in.getIntExtra("pt.tecnico.ulisboa.ITEM_INDEX",-1);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.list_est_seg);
        id_comboios = res.getStringArray(R.array.ID);
        est_seg = res.getStringArray(R.array.Estacao_seguinte);
        linhas = res.getStringArray(R.array.Linhas);
        sentidos = res.getStringArray(R.array.Sentidos);

        String sentido = sentidos[index];
        if (sentido.equals("A1")){
            estacoes = res.getStringArray(R.array.A1);
        }
        else if (sentido.equals("A2")){
            estacoes = res.getStringArray(R.array.A2);
        }
        else if (sentido.equals("B1")){
            estacoes = res.getStringArray(R.array.B1);
        }
        else if (sentido.equals("B2")){
            estacoes = res.getStringArray(R.array.B2);
        }
        else if (sentido.equals("C1")){
            estacoes = res.getStringArray(R.array.C1);
        }
        else if (sentido.equals("C2")){
            estacoes = res.getStringArray(R.array.C2);
        }
        else if (sentido.equals("D1")){
            estacoes = res.getStringArray(R.array.D1);
        }
        else if (sentido.equals("D2")){
            estacoes = res.getStringArray(R.array.D2);
        }
        else if (sentido.equals("E1")){
            estacoes = res.getStringArray(R.array.E1);
        }
        else if (sentido.equals("E2")){
            estacoes = res.getStringArray(R.array.E2);
        }
        else if (sentido.equals("F1")){
            estacoes = res.getStringArray(R.array.F1);
        }
        else if (sentido.equals("F2")){
            estacoes = res.getStringArray(R.array.F2);
        }
        ComboioInfoAdapter comboioInfoAdapter = new ComboioInfoAdapter(this, id_comboios[index],
                est_seg[index], sentidos[index], estacoes, index);
        myListView.setAdapter(comboioInfoAdapter);
        TextView str_sentido = (TextView) findViewById(R.id.sentido_comboio);
        String sentido_aux = sentidos[index];

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

        TextView str_comboios = (TextView) findViewById(R.id.Comboio_tv);
        String name = "C-";
        if (id_comboios[index].length()==1)
            name += "00" + id_comboios[index] + "";
        else if (id_comboios[index].length()==2)
            name += "0" + id_comboios[index] + "";
        else{
            name += id_comboios[index] + "";
        }
        str_comboios.setText(name);
    }
}

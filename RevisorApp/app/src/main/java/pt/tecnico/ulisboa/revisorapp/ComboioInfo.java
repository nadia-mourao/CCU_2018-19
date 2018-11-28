package pt.tecnico.ulisboa.revisorapp;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

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
        myListView = (ListView) findViewById(R.id.list_comboios);
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
    }
}

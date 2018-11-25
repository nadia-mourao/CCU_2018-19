package pt.tecnico.ulisboa.revisorapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListaComboios extends AppCompatActivity {

    ListView myListView;
    String[] id_comboios, est_seg, linhas, sentidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_comboios);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.list_comboios);
        id_comboios = res.getStringArray(R.array.ID);
        est_seg = res.getStringArray(R.array.Estacao_seguinte);
        linhas = res.getStringArray(R.array.Linhas);
        sentidos = res.getStringArray(R.array.Sentidos);

        ComboiosAdapter comboiosAdapter = new ComboiosAdapter(this, id_comboios,sentidos);
        myListView.setAdapter(comboiosAdapter);

    }
}

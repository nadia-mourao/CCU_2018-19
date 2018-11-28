package pt.tecnico.ulisboa.revisorapp;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

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

        ComboiosAdapter comboiosAdapter = new ComboiosAdapter(this, id_comboios,sentidos, est_seg);
        myListView.setAdapter(comboiosAdapter);

        TextView str_title = (TextView) findViewById(R.id.title_comboio);
        str_title.setText("Lista de Comboios");

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent showComboioInfo = new Intent(getApplicationContext(),ComboioInfo.class);
                showComboioInfo.putExtra("pt.tecnico.ulisboa.ITEM_INDEX", i);
                startActivity(showComboioInfo);
            }
        });
    }
}

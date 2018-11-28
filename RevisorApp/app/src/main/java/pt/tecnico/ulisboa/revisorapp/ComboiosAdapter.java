package pt.tecnico.ulisboa.revisorapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by nadia on 25/11/2018.
 */

public class ComboiosAdapter extends BaseAdapter {
    String[] _id_comboios,_sentidos, _estacoes_seguintes;
    LayoutInflater mInflater;

    public ComboiosAdapter(Context c,String[] id_comboios, String[] sentidos,  String[] estacoes_seguintes){
        _id_comboios = id_comboios;
        _sentidos = sentidos;
        _estacoes_seguintes = estacoes_seguintes;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return _id_comboios.length;
    }

    @Override
    public Object getItem(int i) {
        return _id_comboios[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.info_comboios_detail,null);
        TextView str_comboios = (TextView) v.findViewById(R.id.comboio_ID);
        TextView str_sentido = (TextView) v.findViewById(R.id.Sentido);
        TextView str_est_seg = (TextView) v.findViewById(R.id.est_seg_tv);

        String name = "C-";
        if (_id_comboios[i].length()==1)
            name += "00" + _id_comboios[i] + "";
        else if (_id_comboios[i].length()==2)
            name += "0" + _id_comboios[i] + "";
        else{
            name += _id_comboios[i] + "";
        }

        String sentido_aux = _sentidos[i];
        String est_seg = _estacoes_seguintes[i];

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

        str_comboios.setText(name);
        str_est_seg.setText(est_seg);

        return v;
    }
}


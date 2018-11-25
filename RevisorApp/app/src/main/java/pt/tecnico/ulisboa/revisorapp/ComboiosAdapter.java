package pt.tecnico.ulisboa.revisorapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by nadia on 25/11/2018.
 */

public class ComboiosAdapter extends BaseAdapter {
    String[] _id_comboios,_sentidos;
    LayoutInflater mInflater;

    public ComboiosAdapter(Context c,String[] id_comboios, String[] sentidos){
        _id_comboios = id_comboios;
        _sentidos = sentidos;
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
        View v = mInflater.inflate(R.layout.list_comboios_detail,null);
        TextView str_comboios = (TextView) v.findViewById(R.id.comboio_ID);
        TextView str_sentido = (TextView) v.findViewById(R.id.Sentido);

        String name = _id_comboios[i] + "";

        String sentido = _sentidos[i];

        str_comboios.setText(name);
        str_sentido.setText(sentido);

        return v;
    }
}


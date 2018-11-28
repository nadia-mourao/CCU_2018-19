package pt.tecnico.ulisboa.revisorapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nadia on 25/11/2018.
 */

public class ComboioInfoAdapter extends BaseAdapter {
    String _id_comboios, _est_seg, _sentidos;
    String[] _lista_estacao_segs;
    int index;
    LayoutInflater mInflater;

    public ComboioInfoAdapter(Context c, String id_comboios, String est_seg, String sentidos, String[] estacoes, int i){
        _id_comboios = id_comboios;
        _sentidos = sentidos;
        _est_seg = est_seg;
        index = i;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ArrayList<String> lista_estacao_segs = new ArrayList<String>();
        Boolean _flag = false;
        for(String estacao : estacoes){
            if (estacao.equals(_est_seg)){
                _flag = true;
                lista_estacao_segs.add(estacao);
            }
            if (_flag){
                lista_estacao_segs.add(estacao);
            }
        }

        _lista_estacao_segs = new String[lista_estacao_segs.size()];
        int a;
        for (a=0;a<lista_estacao_segs.size(); a++){
            _lista_estacao_segs[a] = lista_estacao_segs.get(a);
        }

    }

    @Override
    public int getCount() {
        return _lista_estacao_segs.length;
    }

    @Override
    public Object getItem(int i) {
        return _lista_estacao_segs[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.list_estacoes_detail,null);
        TextView str_estacao = (TextView) v.findViewById(R.id.estacao_tv);

        str_estacao.setText(_lista_estacao_segs[i]);

        return v;
    }
}


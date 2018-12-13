package com.example.user.metrorevisorapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class PesquisarComboio extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisar_comboio);

        Spinner drop_comboios = (Spinner) findViewById(R.id.drop_comboios);
        String[] id_comboios = getResources().getStringArray(R.array.ID);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, id_comboios);
        drop_comboios.setAdapter(adapter);
        drop_comboios.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView tv_n_invalido = (TextView) findViewById(R.id.tv_n_invalido);
                switch(position){
                    case 0:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 1:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 2:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 3:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 4:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 5:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 6:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 7:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 8:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 9:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 10:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 11:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 12:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 13:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 14:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 15:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 16:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 17:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 18:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 19:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 20:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 21:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 22:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                    case 23:
                        tv_n_invalido.setText((position+2)+"");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}

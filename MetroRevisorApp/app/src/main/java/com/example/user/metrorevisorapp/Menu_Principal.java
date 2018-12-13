package com.example.user.metrorevisorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__principal);

        Button btn_pesquisar_comboios = (Button) findViewById(R.id.btn_pesquisa_comboios);
        btn_pesquisar_comboios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), PesquisarComboio.class);
                startActivity(startIntent);

                }
        });

        Button btn_observar_estacao = (Button) findViewById(R.id.btn_observar_estacao);
        btn_observar_estacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), EscolherEstacao.class);
                startActivity(startIntent);

            }
        });
    }
}

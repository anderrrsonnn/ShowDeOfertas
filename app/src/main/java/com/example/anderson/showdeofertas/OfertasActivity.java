package com.example.anderson.showdeofertas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Anderson on 29/04/2016.
 */
public class OfertasActivity extends AppCompatActivity {
    /**
     * Este metodo inicia a aplicação
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ofertas);

    }

    /**
     * Esse método chama a activity Loja
     */
    public void btLoja(View view) {
        Intent intent = new Intent(OfertasActivity.this, LojaActivity.class);
        startActivity(intent);
    }

    /**
     * Esse método chama a activity Frios
     */
    public void btFrios(View view) {
        Intent intent = new Intent(OfertasActivity.this, FriosActivity.class);
        startActivity(intent);
    }

    /**
     * Esse método chama a activity HF
     */
    public void btHF(View view) {
        Intent intent = new Intent(OfertasActivity.this, HFActivity.class);
        startActivity(intent);
    }

    /**
     * Esse método chama a activity Eletro
     */
    public void btEletro(View view) {
        Intent intent = new Intent(OfertasActivity.this, EletroActivity.class);
        startActivity(intent);
    }

}

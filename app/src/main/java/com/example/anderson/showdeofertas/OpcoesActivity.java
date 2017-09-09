package com.example.anderson.showdeofertas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Anderson on 28/04/2016.
 */
public class OpcoesActivity extends AppCompatActivity {
    /**
     * Este metodo inicia a aplicação
     */
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_opcoes);
    }

    /**
     * Esse método chama a activity Ofertas
     */
    public void btOfertasDia(View view) {
        Intent intent = new Intent(OpcoesActivity.this, OfertasActivity.class);
        startActivity(intent);
    }

    /**
     * Esse método chama a activity Contato
     */
    public void btContato(View view) {
        Intent intent = new Intent(OpcoesActivity.this, ContatoActivity.class);
        startActivity(intent);
    }

    /**
     * Esse método chama a activity Sugestões
     */
    public void btSugestoes(View view) {
        Intent intent = new Intent(OpcoesActivity.this, SugestoesActivity.class);
        startActivity(intent);
    }

    /**
     * Esse método chama a activity Sobre
     */
    public void btSobre(View view) {
        Intent intent = new Intent(OpcoesActivity.this, SobreActivity.class);
        startActivity(intent);
    }


}

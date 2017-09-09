package com.example.anderson.showdeofertas;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Este metodo inicia a aplicação
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "Toque para Iniciar", Toast.LENGTH_LONG).show();

    }

    /**
     * Este método, e chamado quando o usuário toca na tela, ele e responsável por
     * chamar outra activity e iniciar a aplicação.
     */
    public void appIniciar(View view) {
        Intent intent = new Intent(MainActivity.this, OpcoesActivity.class);
        startActivity(intent);
    }


}

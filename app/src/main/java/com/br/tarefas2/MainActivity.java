package com.br.tarefas2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void cadastrar(View v){
        Intent tela_cadastro = new Intent(this, CadastroUsuarioActivity.class);
        startActivity(tela_cadastro);
    }

}
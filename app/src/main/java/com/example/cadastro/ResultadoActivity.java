package com.example.cadastro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    private TextView tvCPF, tvNome, tvIdade, tvSexo, tvInteresses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        // Recupera o Intent que abriu esta tela e os dados enviados nele
        Intent intent = getIntent();
        String cpf = intent.getStringExtra("cpf");
        String nome = intent.getStringExtra("nome");
        String idade = intent.getStringExtra("idade");
        String sexo = intent.getStringExtra("sexo");
        String interesses = intent.getStringExtra("interesses");

        tvCPF = findViewById(R.id.tvCPF);
        tvNome = findViewById(R.id.tvNome);
        tvIdade = findViewById(R.id.tvIdade);
        tvSexo = findViewById(R.id.tvSexo);
        tvInteresses = findViewById(R.id.tvInteresses);

        tvCPF.setText(cpf);
        tvNome.setText(nome);
        tvIdade.setText(idade);
        tvSexo.setText(sexo);
        tvInteresses.setText(interesses);

        Button voltar = findViewById(R.id.voltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
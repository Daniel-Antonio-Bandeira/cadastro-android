package com.example.cadastro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editCpf, editNome, editIdade;
    private CheckBox chkStar, chkGame, chkSenhor;
    private RadioGroup radioSexGroup;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCpf = findViewById(R.id.txtcpf);
        editNome = findViewById(R.id.txtnome);
        editIdade = findViewById(R.id.txtidade);

        chkStar = findViewById(R.id.chkStar);
        chkGame = findViewById(R.id.chkGame);
        chkSenhor = findViewById(R.id.chkSenhor);

        radioSexGroup = findViewById(R.id.radioSex);
        btnDisplay = findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioSexGroup.getCheckedRadioButtonId();

                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this, "Selecione o sexo", Toast.LENGTH_SHORT).show();
                    return;
                }

                RadioButton radioSexButton = findViewById(selectedId);

                String cpf = editCpf.getText().toString();
                String nome = editNome.getText().toString();
                String idade = editIdade.getText().toString();
                String sexo = radioSexButton.getText().toString();

                StringBuilder interesses = new StringBuilder();
                if (chkStar.isChecked()) interesses.append("Star Wars\n");
                if (chkGame.isChecked()) interesses.append("Game of Thrones\n");
                if (chkSenhor.isChecked()) interesses.append("Senhor dos Aneis\n");

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);

                intent.putExtra("cpf", cpf);
                intent.putExtra("nome", nome);
                intent.putExtra("idade", idade);
                intent.putExtra("sexo", sexo);
                intent.putExtra("interesses", interesses.toString());

                startActivity(intent);
            }
        });
    }
}
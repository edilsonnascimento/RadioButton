package br.utfpr.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupLinguagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupLinguagens = findViewById(R.id.radiGroupLinguagens);
    }

    public void mostrarSelecionado(View view){
        String mensagem = "";
        switch (radioGroupLinguagens.getCheckedRadioButtonId()){
            case R.id.radioButtonJava:
                mensagem = getString(R.string.java);
                break;
            case R.id.radioButtonCobol:
                mensagem = getString(R.string.cobol);
                break;
            case R.id.radioButtonPascal:
                mensagem = getString(R.string.pascal);
                break;
            default:
                mensagem = getString(R.string.nao_foi_selecionado);
                break;
        }
        Toast.makeText(this,mensagem, Toast.LENGTH_LONG).show();
    }

    public void desmarcar(View view){
        radioGroupLinguagens.clearCheck();
    }
}
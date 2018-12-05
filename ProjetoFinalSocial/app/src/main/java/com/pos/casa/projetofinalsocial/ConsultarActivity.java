package com.pos.casa.projetofinalsocial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.pos.casa.projetofinalsocial.model.Contatos;
import com.pos.casa.projetofinalsocial.retrofit.RetrofitConfig;

import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ConsultarActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);

        final EditText endereco = findViewById(R.id.endereco);
        final EditText numero = findViewById(R.id.numero);
        final EditText cidade = findViewById(R.id.cidade);
        final EditText bairro = findViewById(R.id.bairro);

        final EditText responsavel = findViewById(R.id.responsavel);
        final EditText telefone = findViewById(R.id.telefone);

        final EditText observacoes = findViewById(R.id.observacoes);

        final TextView textViewResposta = findViewById(R.id.textViewResposta);

        final Contatos contatos = new Contatos();

        Call<List<Contatos>> call = new RetrofitConfig().getService().getAllContatos();

        call.enqueue(new Callback<List<Contatos>>() {
            @Override
            public void onResponse(Call<List<Contatos>> call, Response<List<Contatos>> response) {
                List<Contatos> c = response.body();
                Toast.makeText(getBaseContext(), "Exibindo todos os contatos...", Toast.LENGTH_LONG).show();
                //Log.d("Teste", "Tamanho é: " + c.size());
                textViewResposta.setText(c.toString());
            }

            @Override
            public void onFailure(Call<List<Contatos>> call, Throwable t) {
                Log.e("Service   ", "Falha ao buscar" + t.getMessage());
            }
        });

    }
}

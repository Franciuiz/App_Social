package com.pos.casa.projetofinalsocial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pos.casa.projetofinalsocial.model.Contatos;
import com.pos.casa.projetofinalsocial.retrofit.RetrofitConfig;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CadastrarActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        final EditText endereco = findViewById(R.id.endereco);
        final EditText numero = findViewById(R.id.numero);
        final EditText bairro = findViewById(R.id.bairro);
        final EditText cidade = findViewById(R.id.cidade);

        final EditText responsavel = findViewById(R.id.responsavel);
        final EditText telefone = findViewById(R.id.telefone);

        final EditText observacoes = findViewById(R.id.observacoes);
        Button enviar = findViewById(R.id.enviar);

        final Contatos contatos = new Contatos();

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contatos.setEndereco(endereco.getText().toString());
                contatos.setNumero(numero.getText().toString());
                contatos.setBairro(bairro.getText().toString());
                contatos.setCidade(cidade.getText().toString());
                contatos.setResponsavel(responsavel.getText().toString());
                contatos.setTelefone(telefone.getText().toString());
                contatos.setObservacoes(observacoes.getText().toString());

                //Cadastrar
                Call<Contatos> call = new RetrofitConfig().getService().setContatos(contatos);
                //Toast.makeText(getBaseContext(), endereco.getText().toString() + " foi cadastrado com sucesso", Toast.LENGTH_LONG).show();


                call.enqueue(new Callback<Contatos>() {
                    @Override
                    public void onResponse(Call<Contatos> call, Response<Contatos> response) {
                        if(response.body() != null) {
                            Contatos c = response.body();
                            Toast.makeText(getBaseContext(), endereco.getText().toString() + " foi cadastrado com sucesso", Toast.LENGTH_LONG).show();

                            // finaliza essa activity e retorna para activity originaria
                            finish();
                        } else {
                            Toast.makeText(getBaseContext(), endereco.getText().toString() + " não foi cadastrado com sucesso", Toast.LENGTH_LONG).show();

                        }
                    }

                    @Override
                    public void onFailure(Call<Contatos> call, Throwable t) {
                        Log.e("Service   ", "Falha ao buscar" + t.getMessage());
                    }
                });

            }
        });


    }
}

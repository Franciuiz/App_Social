package com.pos.casa.projetofinalsocial.recyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.pos.casa.projetofinalsocial.R;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter{

    private List<String> contatos;
    private Context context;

    public Adaptador(List<String> contatos, Context context){
        this.contatos = contatos;
        this.context = context;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView endereco;
        private TextView numero;
        private TextView cidade;
        private TextView bairro;

        private TextView responsavel;
        private TextView telefone;

        private TextView observacoes;
        private ImageButton imageButton1;

        public MyViewHolder (View v) {
            super(v);
            endereco = v.findViewById(R.id.endereco);
            numero = v.findViewById(R.id.numero);
            cidade = v.findViewById(R.id.cidade);
            bairro = v.findViewById(R.id.bairro);

            responsavel = v.findViewById(R.id.responsavel);
            telefone = v.findViewById(R.id.telefone);

            observacoes = v.findViewById(R.id.observacoes);
            imageButton1 = v.findViewById(R.id.imageButton1);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycleview_item, parent, false);

        MyViewHolder vholder = new MyViewHolder(v);
        return vholder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MyViewHolder vholder = (MyViewHolder) holder;

        String endereco = contatos.get(position);
        vholder.endereco.setText(endereco);
        String numero = contatos.get(position);
        vholder.numero.setText(numero);
        String cidade = contatos.get(position);
        vholder.cidade.setText(cidade);
        String bairro = contatos.get(position);
        vholder.bairro.setText(bairro);

        String responsavel = contatos.get(position);
        vholder.responsavel.setText(responsavel);
        String telefone = contatos.get(position);
        vholder.telefone.setText(telefone);

        String observacoes = contatos.get(position);
        vholder.observacoes.setText(observacoes);
    }

    @Override
    public int getItemCount() {
        return contatos.size();
    }


}

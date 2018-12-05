package com.pos.casa.projetofinalsocial.model;

public class Contatos {


    private Long id;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;


    private String responsavel;
    private String telefone;

    private String observacoes;


    @Override
    public String toString() {
        return  "\n" +
                "Contatos {" + '\n' +
                "       Id: " + id + '\n' +
                "       Endereco: " + endereco + '\n' +
                "       Numero: " + numero + '\n' +
                "       Bairro: " + bairro + '\n' +
                "       Cidade: " + cidade + '\n' +
                "       Responsavel: " + responsavel + '\n' +
                "       Telefone: " + telefone + '\n' +
                "       Observacoes: " + observacoes + '\n' +
                '}';
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}

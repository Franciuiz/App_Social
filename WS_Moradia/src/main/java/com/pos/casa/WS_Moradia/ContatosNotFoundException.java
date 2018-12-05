package com.pos.casa.WS_Moradia;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ContatosNotFoundException extends RuntimeException {
	
	private String endereco;
    private String numero;
    private String bairro;
    private String cidade;

    private String responsavel;
    private String telefone;

    private String observacoes;

	private Object fieldValue;

	public ContatosNotFoundException(String endereco, String numero, String bairro, String cidade, String responsavel,
			String telefone, String observacoes, Object fieldValue) {
		super(String.format("%s not found with %s : '%s'", endereco, numero, bairro, cidade, responsavel, fieldValue));
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.responsavel = responsavel;
		this.telefone = telefone;
		this.observacoes = observacoes;
		this.fieldValue = fieldValue;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNumero() {
		return numero;
	}

	public String getCidade() {
		return cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public Object getFieldValue() {
		return fieldValue;
	}
	
	
	
	

}

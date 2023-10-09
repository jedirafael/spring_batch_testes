package com.primeiroprojeto.dominio;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Cliente {
	@NotNull
	@Size(min = 1, max = 100)
	@Pattern(regexp = "[a-zA-Z\\s]+",message = "Nome deve ser alfabético")
	private String nome;

	private String sobrenome;
	@NotNull
	@Range(min = 18 , max = 200)
	private String idade;
	@NotNull
	@Size(min = 18, max = 50)
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Cliente{" +
	                "nome='" + nome + "'" +
	                ", sobrenome ='" + sobrenome + "'" +
	                ", idade='" + idade + "'" +
	                ", email='" + email + "'" +
	                '}';
	}
}
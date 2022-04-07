package com.trabalho.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transferencias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String timeOrigem;
	private String timeDestino;
	private String data;
	private String valor;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTimeOrigem() {
		return timeOrigem;
	}


	public void setTimeOrigem(String timeOrigem) {
		this.timeOrigem = timeOrigem;
	}


	public String getTimeDestino() {
		return timeDestino;
	}


	public void setTimeDestino(String timeDestino) {
		this.timeDestino = timeDestino;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transferencias other = (Transferencias) obj;
		return Objects.equals(id, other.id);
	}
	
	
}

package com.trabalho.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Torneio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private ArrayList<String> time = new ArrayList<>();
	private ArrayList<Integer> idPartida = new ArrayList<>();
	

	public ArrayList<String> getTime() {
		return time;
	}

	public void setTime(ArrayList<String> time) {
		this.time = time;
	}

	public ArrayList<Integer> getIdPartida() {
		return idPartida;
	}

	public void setIdPartida(ArrayList<Integer> idPartida) {
		this.idPartida = idPartida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Torneio other = (Torneio) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}

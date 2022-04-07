package com.trabalho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.model.Jogadores;
import com.trabalho.repository.JogadoresRepository;

@RestController
@RequestMapping("/jogadores")
public class ControllerJogadores {	
	
	@Autowired
	private JogadoresRepository jogadoresRepository;
	
	@GetMapping
	public List<Jogadores> listar(){
		return jogadoresRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Jogadores adicionar(@RequestBody Jogadores jogadores) {
		return jogadoresRepository.save(jogadores);
	}
	
	@PutMapping("/{id}")
	public Jogadores alterar(@PathVariable Long id, @RequestBody Jogadores jogadores) {
		jogadores = jogadoresRepository.getById(id);
		
		jogadores.setNome(jogadores.getNome());
		jogadores.setPais(jogadores.getPais());
		jogadores.setDataNascimento(jogadores.getDataNascimento());
		jogadores.setTime(jogadores.getTime());
		
		return jogadoresRepository.save(jogadores);
	}
	
	@DeleteMapping("/{id}")
	public Jogadores deletar(@PathVariable Long id) {
		jogadoresRepository.deleteById(id);
	    return new Jogadores();
	}
		
	
	
}

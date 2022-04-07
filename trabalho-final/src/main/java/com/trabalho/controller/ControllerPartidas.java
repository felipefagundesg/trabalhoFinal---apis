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

import com.trabalho.model.Partidas;
import com.trabalho.repository.PartidasRepository;

@RestController
@RequestMapping("/partidas")
public class ControllerPartidas {	
	
	@Autowired
	private PartidasRepository partidasRepository;
	
	@GetMapping
	public List<Partidas> listar(){
		return partidasRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Partidas adicionar(@RequestBody Partidas partidas) {
		return partidasRepository.save(partidas);
	}
	
	@PutMapping("/{id}")
	public Partidas alterar(@PathVariable Long id, @RequestBody Partidas partidas) {
		partidas = partidasRepository.getById(id);
		
		partidas.setTime1(partidas.getTime1());
		partidas.setTime2(partidas.getTime2());
		
		return partidasRepository.save(partidas);
	}
	
	@DeleteMapping("/{id}")
	public Partidas deletar(@PathVariable Long id) {
		partidasRepository.deleteById(id);
	    return new Partidas();
	}
		
	
	
}

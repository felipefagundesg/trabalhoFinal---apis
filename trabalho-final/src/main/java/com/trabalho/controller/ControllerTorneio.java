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

import com.trabalho.model.Torneio;
import com.trabalho.repository.TorneioRepository;

@RestController
@RequestMapping("/torneios")
public class ControllerTorneio {	
	
	@Autowired
	private TorneioRepository torneioRepository;
		
	@GetMapping
	public List<Torneio> listar(){
		return torneioRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Torneio adicionar(@RequestBody Torneio torneio) {
		return torneioRepository.save(torneio);
	}	
	
	@PutMapping("/{id}")
	public Torneio alterar(@PathVariable Long id, @RequestBody Torneio torneio) {
		torneio = torneioRepository.getById(id);
		
		torneio.setTime(torneio.getTime());
		torneio.setIdPartida(torneio.getIdPartida());

		return torneioRepository.save(torneio);
	}
	
	@DeleteMapping("/{id}")
	public Torneio deletar(@PathVariable Long id) {
		torneioRepository.deleteById(id);
	    return new Torneio();
	}
		
	
	
}

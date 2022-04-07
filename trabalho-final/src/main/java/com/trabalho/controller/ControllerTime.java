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

import com.trabalho.model.Time;
import com.trabalho.repository.TimeRepository;

@RestController
@RequestMapping("/times")
public class ControllerTime {
	

	@Autowired
	private TimeRepository timeRepository;
	
	@GetMapping
	public List<Time> listar(){
		return timeRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Time adicionar(@RequestBody Time time) {
		return timeRepository.save(time);
	}
	
	@PutMapping("/{id}")
	public Time alterar(@PathVariable Long id, @RequestBody Time time) {
		time = timeRepository.getById(id);
		
		time.setNome(time.getNome());
		time.setLocalidade(time.getLocalidade());
		
		return timeRepository.save(time);
	}
	
	@DeleteMapping("/{id}")
	public Time deletar(@PathVariable Long id) {
		timeRepository.deleteById(id);
	    return new Time();
	}
		
	
	
}

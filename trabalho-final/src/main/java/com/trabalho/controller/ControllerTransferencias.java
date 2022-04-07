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

import com.trabalho.model.Transferencias;
import com.trabalho.repository.TransferenciasRepository;

@RestController
@RequestMapping("/transferencias")
public class ControllerTransferencias {	
	
	@Autowired
	private TransferenciasRepository transferenciasRepository;
	
	@GetMapping
	public List<Transferencias> listar(){
		return transferenciasRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Transferencias adicionar(@RequestBody Transferencias transferencias) {
		return transferenciasRepository.save(transferencias);
	}
	
	@PutMapping("/{id}")
	public Transferencias alterar(@PathVariable Long id, @RequestBody Transferencias transferencias) {
		transferencias = transferenciasRepository.getById(id);
		
		transferencias.setNome(transferencias.getNome());
		transferencias.setTimeOrigem(transferencias.getTimeOrigem());
		transferencias.setTimeDestino(transferencias.getTimeDestino());
		transferencias.setData(transferencias.getData());
		transferencias.setValor(transferencias.getValor());
		
		return transferenciasRepository.save(transferencias);
	}
	
	@DeleteMapping("/{id}")
	public Transferencias deletar(@PathVariable Long id) {
		transferenciasRepository.deleteById(id);
	    return new Transferencias();
	}
		
	
	
}

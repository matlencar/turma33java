package com.minhaLojaDeGames.ecommerceGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaLojaDeGames.ecommerceGames.model.CategoriaGames;
import com.minhaLojaDeGames.ecommerceGames.repository.RepositoryGames;

public class ControllerGames {
	
	@RestController
	@RequestMapping("/Games")
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	public class GamesController {

		@Autowired
		RepositoryGames repository;
		
		@GetMapping
		public ResponseEntity<List<CategoriaGames>> GetAll() {
			return ResponseEntity.ok(repository.findAll());
		
	}
		@GetMapping("/{id}") 
		public ResponseEntity<CategoriaGames> GetById(@PathVariable long id) {
			return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
		}
		
		@GetMapping("/descricao/{descricao}")
		public ResponseEntity<List<CategoriaGames>> GetByTitulo(@PathVariable String descricao) {
			return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
		}
		
		@PostMapping
		public ResponseEntity<CategoriaGames> post(@RequestBody CategoriaGames categoria) {
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
		}
		
		@PutMapping
		public ResponseEntity<CategoriaGames> put(@RequestBody CategoriaGames categoria) {
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
		}
		
		@DeleteMapping("/{id}")
		public void delete(@PathVariable long id) {
			repository.deleteById(id);
		}
	}
}
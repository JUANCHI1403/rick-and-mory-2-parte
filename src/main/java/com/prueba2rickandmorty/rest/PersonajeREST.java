package com.prueba2rickandmorty.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba2rickandmorty.model.Personaje;
import com.prueba2rickandmorty.service.PersonajeService;

@RestController
public class PersonajeREST {
	
	private PersonajeService personajeService;

	
	@PostMapping
	private ResponseEntity<Personaje> guardar(Personaje personaje){
		Personaje temporal = personajeService.create(personaje);
		
		try {
			return ResponseEntity.created(newURI("api/personaje"+temporal.getId())).body(temporal);
			
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping
	private ResponseEntity<List<Personaje>> listarPersonajes(Personaje personaje){
		return  ResponseEntity.ok(personajeService.getAllPersonaje());

	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarPersonaje(Personaje personaje){
		personajeService.delete(personaje);
		return  ResponseEntity.ok().build();

	}
	
	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<Personaje>> listarPersonaje(@PathVariable("id") Long id){
		return  ResponseEntity.ok(personajeService.create(id));

	}
	
	
}

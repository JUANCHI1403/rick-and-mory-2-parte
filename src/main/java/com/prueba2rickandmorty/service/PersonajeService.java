package com.prueba2rickandmorty.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba2rickandmorty.model.Personaje;
import com.prueba2rickandmorty.repository.PersonajeRepository;


@Service
public class PersonajeService {
	
	@Autowired
	private PersonajeRepository personajeRepository;
	
	
	public Personaje create (Personaje personaje) {
		return personajeRepository.save(personaje);
		
	}
	
	public List<Personaje> getAllPersonaje(){
	return personajeRepository.findAll();
	
	}
	
	public void delete (Personaje personaje) {
		personajeRepository.delete(personaje);
		
	}
	
	public Optional<Personaje> create (Long id) {
		return personajeRepository.findById(id);
		
	}
	
	
	
}

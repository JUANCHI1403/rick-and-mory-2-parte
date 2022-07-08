package com.prueba2rickandmorty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba2rickandmorty.model.Personaje;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
	
	

}

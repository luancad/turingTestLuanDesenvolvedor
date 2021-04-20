package com.agendaTelefonica.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agendaTelefonica.apirest.models.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{
	
	Contato findById(long id);
}

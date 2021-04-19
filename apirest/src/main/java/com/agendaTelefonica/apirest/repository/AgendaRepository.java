package com.agendaTelefonica.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agendaTelefonica.apirest.models.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{
	
	Agenda findById(long id);
}

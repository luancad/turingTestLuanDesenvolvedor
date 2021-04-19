package com.agendaTelefonica.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agendaTelefonica.apirest.models.Agenda;
import com.agendaTelefonica.apirest.repository.AgendaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API Rest Agendas")
@CrossOrigin(origins="*")
public class AgendaResource {
	@Autowired
	AgendaRepository agendaRepository;
	
	@GetMapping("/agendas")
	@ApiOperation(value="Retorna uma lista de contatos")
	public List<Agenda> listaAgendas(){
		return agendaRepository.findAll();
	}
	
	@GetMapping("/agenda/{id}")
	@ApiOperation(value="Retorna um contato unico")
	public Agenda AgendasUnico(@PathVariable(value="id")long id){
		return agendaRepository.findById(id);				
				
	}
			
	@PostMapping("/agenda")
	@ApiOperation(value="Salva um contato unico")
	public Agenda salvaAgenda(@RequestBody Agenda agenda) {
		return agendaRepository.save(agenda);
	}
	
	@DeleteMapping("/agenda")
	@ApiOperation(value="Deleta um contato unico")
	public void deletaAgenda(@RequestBody Agenda agenda) {
		agendaRepository.delete(agenda);
	}
	
	@PutMapping("/agenda")
	@ApiOperation(value="Atualiza um contato unico")
	public Agenda atualizaAgenda(@RequestBody Agenda agenda) {
		return agendaRepository.save(agenda);
	}
}
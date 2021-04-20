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

import com.agendaTelefonica.apirest.models.Contato;
import com.agendaTelefonica.apirest.repository.ContatoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API Rest Contatos")
@CrossOrigin(origins="*")
public class ContatoResource {
	@Autowired
	ContatoRepository contatoRepository;
	
	@GetMapping("/contatos")
	@ApiOperation(value="Retorna uma lista de contatos")
	public List<Contato> listaContatos(){
		return contatoRepository.findAll();
	}
	
	@GetMapping("/contato/{id}")
	@ApiOperation(value="Retorna um contato unico")
	public Contato ContatoUnico(@PathVariable(value="id")long id){
		return contatoRepository.findById(id);				
				
	}
			
	@PostMapping("/contato")
	@ApiOperation(value="Salva um contato unico")
	public Contato salvaContato(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}
	
	@DeleteMapping("/contato")
	@ApiOperation(value="Deleta um contato unico")
	public void deletaContato(@RequestBody Contato contato) {
		contatoRepository.delete(contato);
	}
	
	@PutMapping("/contato")
	@ApiOperation(value="Atualiza um contato unico")
	public Contato contato(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}
}
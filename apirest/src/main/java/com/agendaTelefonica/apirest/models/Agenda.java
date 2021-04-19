package com.agendaTelefonica.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_AGENDA")
public class Agenda implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String nome;
	
	private String email;
	
	private BigDecimal rg;
	
	private BigDecimal numTelefone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getRg() {
		return rg;
	}

	public void setRg(BigDecimal rg) {
		this.rg = rg;
	}

	public BigDecimal getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(BigDecimal numTelefone) {
		this.numTelefone = numTelefone;
	}
	
	
}

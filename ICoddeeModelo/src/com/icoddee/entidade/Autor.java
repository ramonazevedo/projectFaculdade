package com.icoddee.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Jocelio Lima
 *
 */
@Entity
public class Autor {
	
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String nome;

	public Autor(){
		
	}
	
	public Autor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}

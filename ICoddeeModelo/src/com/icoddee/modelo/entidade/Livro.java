package com.icoddee.modelo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author Jocélio Lima
 *
 */
@Entity
public class Livro {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String titulo;  
	@Column
	private String autor;
	@Column
	private String editora;
	@Column
	private int ano;
	@Column
	private boolean cativo;
	@Column
	private int paginas;
	@Column
	private int isbn;
	
	public Livro(){
		
	}
	public Livro(String autor, String editora){
		this.autor = autor;
		this.editora = editora;
	}
	
	
	public Livro(int id, String titulo, String autor, String editora, int ano,
			boolean cativo, int paginas, int isbn) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.ano = ano;
		this.cativo = cativo;
		this.paginas = paginas;
		this.isbn = isbn;
	}


	public Livro(String titulo){
		this.titulo = titulo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isCativo() {
		return cativo;
	}
	public void setCativo(boolean cativo) {
		this.cativo = cativo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	@Override
	public String toString() {
		return "Livro [id=" + id + ", autor=" + autor + ", editora=" + editora
				+ ", paginas=" + paginas + ", titulo=" + titulo + ", cativo="
				+ cativo + ", ano=" + ano + "]";
	}
	
	
	

}

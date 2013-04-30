package com.icoddee.entidade;

/**
 * @author Jocélio Lima
 *
 */
public class Livro {
	
	private int id;
	private String titulo;
	private Autor autor;
	private Editora editora;
	private int ano;
	private boolean cativo;
	private int paginas;
	private int isbn;
	
	public Livro(){
		
	}
	public Livro(Autor autor, Editora editora){
		this.autor = autor;
		this.editora = editora;
	}
	
	
	public Livro(int id, String titulo, Autor autor, Editora editora, int ano,
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
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
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
		return "Livro [id=" + id + ", autor=" + autor.getNome() + ", editora=" + editora.getNome()
				+ ", paginas=" + paginas + ", titulo=" + titulo + ", cativo="
				+ cativo + ", ano=" + ano + "]";
	}
	
	
	

}

package com.icoddee.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.icoddee.entidade.Autor;
import com.icoddee.entidade.Editora;
import com.icoddee.entidade.Livro;

@ManagedBean
@RequestScoped
public class CadastroLivros {

	private Livro livro;
	private Autor autor;
	private Editora editora;
	
	
	public CadastroLivros() {
		this.livro = new Livro();
		this.autor = new Autor();
		this.editora = new Editora();
		
		this.livro.setAutor(autor);
		this.livro.setEditora(editora);
	}


	public String cadastrarLivro(){
		System.out.println(livro.toString());
		return null;
	}
	
	
	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	
	
	
}

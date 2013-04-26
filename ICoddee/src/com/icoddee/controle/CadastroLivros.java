package com.icoddee.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.icoddee.entidade.Livro;

@ManagedBean
@RequestScoped
public class CadastroLivros {

	private Livro livro;
	
	
	
	public CadastroLivros() {
		this.livro = new Livro();
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

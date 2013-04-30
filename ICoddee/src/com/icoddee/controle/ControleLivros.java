package com.icoddee.controle;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.icoddee.entidade.Autor;
import com.icoddee.entidade.Editora;
import com.icoddee.entidade.Livro;
import com.icoddee.modelo.imp.LivroDAO;
import com.icoddee.modelo.inter.IRepositorioLivro;

@ManagedBean
@SessionScoped
public class ControleLivros {

	private List<Livro> livros;
	private IRepositorioLivro livroDAO;
	private Livro livro;
	
	public ControleLivros() {
		this.livroDAO = new LivroDAO();
		this.livros = livroDAO.listar();
	}
	public String novo(){
		this.livro = new Livro(new Autor(), new Editora());
		return "cadastrosLivro";
	}
	
	public String salvar(){
		if(!livros.contains(livro))
		this.livros.add(this.livro);
		return "listaLivros";
	}
	
	public String remover(){
		livros.remove(livro);
		return "listaLivros";
	}
	
	public String editar(){
		this.livro = livro;
		return "cadastrosLivro";
	}
	
	public List<Livro> getLivros() {
		return livros;
	}


	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}


	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
	



	
	
	
}

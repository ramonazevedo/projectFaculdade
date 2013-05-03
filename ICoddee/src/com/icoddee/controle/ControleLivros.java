package com.icoddee.controle;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.icoddee.modelo.IRepositorioLivro;
import com.icoddee.modelo.entidade.Livro;
import com.icoddee.modelo.fabrica.IcoddeeFactory;

@ManagedBean
@SessionScoped
public class ControleLivros {

	private List<Livro> livros;
	private IRepositorioLivro livroDAO;
	private Livro livro;
	
	public ControleLivros() {
		this.livroDAO = new IcoddeeFactory().criarLivroDAO(IcoddeeFactory.LivroJPA);
		this.livros = livroDAO.listar();
	}
	public String novo(){
		this.livro = new Livro();
		return "cadastrosLivro";
	}
	
	public String salvar(){
		livroDAO.cadastrar(livro);
		return "listaLivros";
	}
	
	public String remover(){
		livroDAO.excluir(livro);
		return "listaLivros";
	}
	
	public String editar(){
		this.livro = livro;
		return "cadastrosLivro";
	}
	
	public List<Livro> getLivros() {
		return livros = livroDAO.listar();
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

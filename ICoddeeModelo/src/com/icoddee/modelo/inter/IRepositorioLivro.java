package com.icoddee.modelo.inter;

import java.util.List;

import com.icoddee.entidade.Livro;

public interface IRepositorioLivro {
	
	public List<Livro> listar();
	public void excluir(Livro livro);
	public void atualizar(Livro livro);
	public void cadastrar(Livro livro);
	public Livro getLivro(Livro livro);
	

}

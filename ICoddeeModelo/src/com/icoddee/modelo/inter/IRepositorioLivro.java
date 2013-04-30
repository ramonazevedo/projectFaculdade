package com.icoddee.modelo.inter;

import java.util.List;

import com.icoddee.entidade.Livro;

public interface IRepositorioLivro {
	
	public List<Livro> listar();
	public void excluir();
	public void atualizar();
	public void cadastrar();

}

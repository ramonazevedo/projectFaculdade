package com.icoddee.modelo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.icoddee.modelo.IRepositorioLivro;
import com.icoddee.modelo.entidade.Livro;

public class LivroDAO implements IRepositorioLivro {
	private EntityManager em;
	
	public LivroDAO(EntityManager em){
		this.em = em;
	}

	@Override
	public List<Livro> listar(){
		List<Livro> listLivro = new ArrayList<Livro>();
		
		listLivro.add(new Livro(0, "Macunaima", "Armando","Abril", 2008, false, 200, 252154));
		listLivro.add(new Livro(0, "Game of Thrones","George Margin","Nova", 2011, false, 1000,58546));
		listLivro.add(new Livro(0, "Triste fim de Policarpo Quaresma", "Lima Barreto","Nova", 1916, false, 304,45875));
		
		
		
		return listLivro;
	}

	@Override
	public void excluir(Livro livro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Livro livro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrar(Livro livro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Livro getLivro(Livro livro) {
		// TODO Auto-generated method stub
		return null;
	}


}

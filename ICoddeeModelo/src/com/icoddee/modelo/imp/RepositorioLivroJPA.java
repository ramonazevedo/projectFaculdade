package com.icoddee.modelo.imp;

import java.util.List;

import javax.persistence.EntityManager;

import com.icoddee.entidade.Livro;
import com.icoddee.modelo.inter.IRepositorioLivro;

public class RepositorioLivroJPA implements IRepositorioLivro {
	
	private EntityManager em;
	
	public RepositorioLivroJPA(EntityManager em){
		this.em = em;
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
		em.getTransaction().begin();
		em.merge(livro);
		em.getTransaction().commit();		
	}

	@Override
	public List<Livro> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}

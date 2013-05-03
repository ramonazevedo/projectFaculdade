package com.icoddee.modelo.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.icoddee.modelo.IRepositorioLivro;
import com.icoddee.modelo.entidade.Livro;

public class RepositorioLivroJPA implements IRepositorioLivro {

	private EntityManager em;
	private List<Livro> livros;

	public RepositorioLivroJPA(EntityManager em) {
		this.em = em;
	}

	@Override
	public void excluir(Livro livro) {
		em.getTransaction().begin();
		em.remove(livro);
		em.getTransaction().commit();

	}

	@Override
	public void atualizar(Livro livro) {
		em.getTransaction().begin();
		em.merge(livro);
		em.getTransaction().commit();
	}

	@Override
	public void cadastrar(Livro livro) {
		em.getTransaction().begin();
		em.merge(livro);
		em.getTransaction().commit();
	}

	@Override
	public List<Livro> listar() {
		em.getTransaction().begin();
		Query q = em.createQuery("select livro from Livro livro");
		this.livros = q.getResultList();
		em.getTransaction().commit();
		return this.livros;
	}

	public Livro getLivro(Livro livro) {
		Livro l = null;
		if (livro.getId() != 0) {
			em.getTransaction().begin();
			l = em.find(Livro.class, livro.getId());
			em.getTransaction().commit();
		}
		return l;
	}

}

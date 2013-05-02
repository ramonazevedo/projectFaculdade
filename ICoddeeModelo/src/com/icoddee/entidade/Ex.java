package com.icoddee.entidade;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.icoddee.modelo.imp.RepositorioLivroJPA;
import com.icoddee.modelo.inter.IRepositorioLivro;


public class Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Livro livro = new Livro(1, "jocelio", "ee","ee", 3005, true, 65, 665);
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("icoddee");
		EntityManager em = emf.createEntityManager();
		
		IRepositorioLivro repositorioLivro = new RepositorioLivroJPA(em);
		
		repositorioLivro.excluir(repositorioLivro.getLivro(livro));
		
		emf.close();
		em.close();
		
		

	}

}

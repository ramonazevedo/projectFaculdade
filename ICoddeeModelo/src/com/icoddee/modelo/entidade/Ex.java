package com.icoddee.modelo.entidade;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.icoddee.modelo.IRepositorioLivro;
import com.icoddee.modelo.fabrica.RepositorioFabrica;
import com.icoddee.modelo.impl.RepositorioLivroJPA;


public class Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Livro livro = new Livro(1, "hehe", "ee","ee", 3005, true, 65, 665);
	
		
		IRepositorioLivro repositorioLivro = (IRepositorioLivro) new RepositorioFabrica().criar(RepositorioFabrica.LivroJPA);
		
		
		repositorioLivro.cadastrar(livro);
		
		

	}

}

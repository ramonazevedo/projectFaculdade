package com.icoddee.modelo.fabrica;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.icoddee.modelo.impl.*;

public class RepositorioFabrica {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	public static final int LivroDAO = 0;
	public static final int LivroJPA = 1;
	public static final int EmprestimoDAO = 2;

	public RepositorioFabrica(){
		this.emf = Persistence.createEntityManagerFactory("icoddee");
		this.em = emf.createEntityManager();
	}
	
	public Object criar(int dao){
		
		switch (dao) {
		case 0:
			return new LivroDAO(em);
		case 1:
			return new RepositorioLivroJPA(em);
		case 2:
			return new RepositorioEmprestimo(em);
		default: 
			return null;
		}
	}
	
	
}

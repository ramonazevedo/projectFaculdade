package com.icoddee.modelo.fabrica;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.icoddee.modelo.IRepositorioEmprestimo;
import com.icoddee.modelo.IRepositorioLivro;
import com.icoddee.modelo.impl.*;

public class IcoddeeFactory {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	public static final int LivroJPA = 0;
	public static final int EmprestimoDAO = 2;

	public IcoddeeFactory(){
		this.emf = Persistence.createEntityManagerFactory("icoddee");
		this.em = emf.createEntityManager();
	}
	
	public IRepositorioLivro criarLivroDAO(int dao){
		
		switch (dao) {
		case 0:
			return new RepositorioLivroJPA(em);			
		default: 
			return null;
		}
	}
	
public IRepositorioEmprestimo criarEmprestimoDAO(int dao){
		
		switch (dao) {
		case 0: return null;
		case 1: return null;
		case 2: return new RepositorioEmprestimo(em); 
		default: 
			return null;
		}
	}
	
	
}

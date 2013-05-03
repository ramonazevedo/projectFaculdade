package com.icoddee.modelo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.icoddee.modelo.IRepositorioEmprestimo;
import com.icoddee.modelo.entidade.Aluno;
import com.icoddee.modelo.entidade.Emprestimo;
import com.icoddee.modelo.entidade.Livro;

public class RepositorioEmprestimo implements IRepositorioEmprestimo{
	
	private EntityManager em;
	
	

	public RepositorioEmprestimo(EntityManager em) {
		this.em = em;
	}
	private List<Emprestimo> emprestimos;
	@Override
	public List<Emprestimo> listaEmprestimos(){
		
		emprestimos = new ArrayList<Emprestimo>();
		
		emprestimos.add(new Emprestimo( 1 , new Aluno("jocelio lima"), new Livro("Use a cabeça Java Web") ,"20/04/2013","01/05/2013"));
		
		emprestimos.add(new Emprestimo( 2 , new Aluno("Daniel"), new Livro("Html5 & Css3") ,"20/04/2013","01/05/2013"));
		
		emprestimos.add(new Emprestimo( 3 , new Aluno("Henrique"), new Livro("Assembly Avançado") ,"20/04/2013","01/05/2013"));
		
		emprestimos.add(new Emprestimo( 4 , new Aluno("Felipe"), new Livro("JSP + Servlets") ,"20/04/2013","01/05/2013"));
		
		emprestimos.add(new Emprestimo( 5 , new Aluno("Ricardo"), new Livro("Bite code") ,"20/04/2013","01/05/2013"));
		
		return emprestimos;
	}

	
}

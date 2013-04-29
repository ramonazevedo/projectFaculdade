package com.icoddee.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.icoddee.entidade.Aluno;
import com.icoddee.entidade.Emprestimo;
import com.icoddee.entidade.Livro;


@ManagedBean
@SessionScoped

public class ControleEmprestimo {

	private List<Emprestimo> emprestimos;
	
	
	public ControleEmprestimo(){
		
		emprestimos = new ArrayList<Emprestimo>();
		
		
		emprestimos.add(new Emprestimo( 1 , new Aluno("jocelio lima"),  new Livro("Use a cabeça Java Web") ,"20/04/2013","01/05/2013"));
		
		emprestimos.add(new Emprestimo( 2 , new Aluno("Daniel"),  new Livro("Html5 & Css3") ,"20/04/2013","01/05/2013"));
		
		emprestimos.add(new Emprestimo( 3 , new Aluno("Henrique"),  new Livro("Assembly Avançado") ,"20/04/2013","01/05/2013"));
		
		emprestimos.add(new Emprestimo( 4 , new Aluno("Felipe"),  new Livro("JSP + Servlets") ,"20/04/2013","01/05/2013"));
		
		emprestimos.add(new Emprestimo( 5 , new Aluno("Ricardo"),  new Livro("Bite code") ,"20/04/2013","01/05/2013"));
		

	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}
	
	
	
	
	
}

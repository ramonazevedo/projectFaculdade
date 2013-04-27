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
		Aluno a = new Aluno();
		Livro l = new Livro();
		l.setTitulo("Use a cabeça JAVA WEB");
		
		emprestimos.add(new Emprestimo( 1 , new Aluno(),  new Livro() ,"20/04/2013","01/05/2013"));
		emprestimos.get(0).getAluno().setNome("jocelio lima");
		emprestimos.get(0).getLivro().setTitulo("Use a cabeça Java Web");
		emprestimos.add(new Emprestimo( 1 , new Aluno(),  new Livro() ,"20/04/2013","01/05/2013"));
		emprestimos.get(1).getAluno().setNome("Daniel");
		emprestimos.get(1).getLivro().setTitulo("Html5 & Css3");
		emprestimos.add(new Emprestimo( 1 , new Aluno(),  new Livro() ,"20/04/2013","01/05/2013"));
		emprestimos.get(2).getAluno().setNome("Henrique");
		emprestimos.get(2).getLivro().setTitulo("Assembly Avançado");
		emprestimos.add(new Emprestimo( 1 , new Aluno(),  new Livro() ,"20/04/2013","01/05/2013"));
		emprestimos.get(3).getAluno().setNome("Felipe");
		emprestimos.get(3).getLivro().setTitulo("JSP + Servlets");
		emprestimos.add(new Emprestimo( 1 , new Aluno(),  new Livro() ,"20/04/2013","01/05/2013"));
		emprestimos.get(4).getAluno().setNome("Ricardo");
		emprestimos.get(4).getLivro().setTitulo("Bite code");
		

	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}
	
	
	
	
	
}

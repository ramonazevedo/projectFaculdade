package com.icoddee.controle;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import com.icoddee.entidade.Emprestimo;
import com.icoddee.modelo.imp.RepositorioEmprestimo;
import com.icoddee.modelo.inter.IRepositorioEmprestimo;


@ManagedBean
@SessionScoped
public class ControleEmprestimo {

	private IRepositorioEmprestimo repositorioEmprestimo;
	private List<Emprestimo> emprestimos;
	
	
	public ControleEmprestimo(){
		this.repositorioEmprestimo = new RepositorioEmprestimo();
		this.emprestimos = repositorioEmprestimo.listaEmprestimos();
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}
	
	
	
	
	
}

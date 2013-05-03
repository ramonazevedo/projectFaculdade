package com.icoddee.controle;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.icoddee.modelo.IRepositorioEmprestimo;
import com.icoddee.modelo.entidade.Emprestimo;
import com.icoddee.modelo.fabrica.IcoddeeFactory;




@ManagedBean
@SessionScoped
public class ControleEmprestimo {

	private IRepositorioEmprestimo repositorioEmprestimo;
	private List<Emprestimo> emprestimos;
	
	
	public ControleEmprestimo(){
		this.repositorioEmprestimo = new IcoddeeFactory().criarEmprestimoDAO(IcoddeeFactory.EmprestimoDAO);
		this.emprestimos = repositorioEmprestimo.listaEmprestimos();
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}
	
	
	
	
	
}

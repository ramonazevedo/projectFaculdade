package com.icoddee.modelo.imp;

import java.util.ArrayList;
import java.util.List;

import com.icoddee.entidade.Autor;
import com.icoddee.entidade.Editora;
import com.icoddee.entidade.Livro;
import com.icoddee.modelo.inter.IRepositorioLivro;

public class LivroDAO implements IRepositorioLivro {
	
	public LivroDAO(){
	
	}

	@Override
	public List<Livro> listar(){
		List<Livro> listLivro = new ArrayList<Livro>();
		
		listLivro.add(new Livro(0, "Macunaima", new Autor("Armando"),new Editora("Abril"), 2008, false, 200, 252154));
		listLivro.add(new Livro(0, "Game of Thrones", new Autor("George Margin"),new Editora("Nova"), 2011, false, 1000,58546));
		listLivro.add(new Livro(0, "Triste fim de Policarpo Quaresma", new Autor("Lima Barreto"),new Editora("Nova"), 1916, false, 304,45875));
		
		
		
		return listLivro;
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cadastrar() {
		// TODO Auto-generated method stub

	}

}

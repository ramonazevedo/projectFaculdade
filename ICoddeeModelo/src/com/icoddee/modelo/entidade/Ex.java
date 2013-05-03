package com.icoddee.modelo.entidade;





import com.icoddee.modelo.IRepositorioLivro;
import com.icoddee.modelo.fabrica.IcoddeeFactory;


public class Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Livro livro = new Livro(1, "hehe", "ee","ee", 3005, true, 65, 665);
	
		
		IRepositorioLivro repositorioLivro =  new IcoddeeFactory().criarLivroDAO(IcoddeeFactory.LivroJPA);
		
		
		repositorioLivro.cadastrar(livro);
		repositorioLivro.excluir(livro);
		
		

	}

}

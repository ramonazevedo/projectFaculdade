package com.login.model;

import com.login.model.entity.Usuario;
import com.login.model.factory.LoginDaoFactory;


public class Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IUsuarioDAO usuarioDAO = new LoginDaoFactory().createUsuarioDAO(LoginDaoFactory.UsuarioDaoMysql);
		
		Usuario usuario = new Usuario();
		usuario.setNome("jocelio lima");
		usuario.setLogin("jocelio");
		usuario.setSenha("qwe123");
		
		Usuario u = usuarioDAO.executarLogin(usuario);
		System.out.println(u == null);

	}

}

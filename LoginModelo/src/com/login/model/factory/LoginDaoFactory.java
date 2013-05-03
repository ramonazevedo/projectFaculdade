package com.login.model.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.login.model.IUsuarioDAO;
import com.login.model.impl.UsuarioDaoMysql;

public class LoginDaoFactory {
	
	public static final int UsuarioDaoMysql = 0;
	
	private EntityManager em;
	private EntityManagerFactory emf;
	
	public LoginDaoFactory() {
		
		this.emf = Persistence.createEntityManagerFactory("icoddee");
		this.em = emf.createEntityManager();
	
	}
	
	public IUsuarioDAO createUsuarioDAO(int DAO){
		switch (DAO){
		case 0: return new UsuarioDaoMysql(em);
		default: return null;
		}
	}
	
	

}

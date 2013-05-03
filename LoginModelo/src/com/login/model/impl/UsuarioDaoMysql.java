package com.login.model.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.login.model.IUsuarioDAO;
import com.login.model.entity.Usuario;

public class UsuarioDaoMysql implements IUsuarioDAO {

	private EntityManager em;

	public UsuarioDaoMysql(EntityManager em) {
		this.em = em;
	}

	@Override
	public void salvar(Usuario usuario) {
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void remover(Usuario usuario) {
		em.getTransaction().begin();
		em.remove(usuario);
		em.getTransaction().commit();
		em.close();

	}

	@Override
	public void atualizar(Usuario usuario) {
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<Usuario> listar() {
		em.getTransaction().begin();
		Query q = em.createQuery("select usuario from Usuario usuario");
		List<Usuario> usuarios = q.getResultList();
		em.getTransaction().commit();
		em.close();
		return usuarios;
	}

	@Override
	public Usuario executarLogin(Usuario usuario) {
		Usuario u = null;
		em.getTransaction().begin();
		Query q = em
				.createQuery("select usuario from Usuario usuario where usuario.login = :login and usuario.senha = :senha");
		q.setParameter("login", usuario.getLogin());
		q.setParameter("senha", usuario.getSenha());
		q.setMaxResults(1);
		try {
			u = (Usuario) q.getSingleResult();
		} catch (Exception e) {
			return null;
		}
		em.getTransaction().commit();
		em.close();
		return u;
	}

	@Override
	public Usuario getById(Usuario usuario) {
		Usuario u = null;
		em.getTransaction().begin();
		u = em.find(Usuario.class, usuario.getId());
		em.getTransaction().commit();
		em.close();
		return u;
	}

}

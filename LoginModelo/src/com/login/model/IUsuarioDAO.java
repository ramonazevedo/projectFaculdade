package com.login.model;

import java.util.List;

import com.login.model.entity.Usuario;

public interface IUsuarioDAO {
	
	public void salvar(Usuario usuario);
	public void remover(Usuario usuario);
	public void atualizar(Usuario usuario);
	public List<Usuario> listar();
	public Usuario executarLogin(Usuario usuario);
	public Usuario getById(Usuario usuario);
	

}

package org.vendas.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.vendas.model.entity.BCHATMKT001_USER_DS;

public interface UsuarioDAO {

	public void setSession(Session sessao);
	
	public void saveUser(BCHATMKT001_USER_DS usuario);
//	
//	public void savePermissao(BCHATMKT001_USER_PERMISSION_DS permissao);
	
	public void deleteUser(BCHATMKT001_USER_DS usuario);

	public BCHATMKT001_USER_DS consultUser(Integer id);
	
	public List<BCHATMKT001_USER_DS> listUser();
}

package org.vendas.business.usuario;

import java.util.List;

import org.vendas.model.dao.UsuarioDAO;
import org.vendas.model.entity.BCHATMKT001_USER_DS;
import org.vendas.model.entity.BCHATMKT001_USER_PERMISSION_DS;
import org.vendas.util.DAOFactory;

public class UsuarioRN{

	private UsuarioDAO usuarioDAO;
	
	public UsuarioRN() {
		// TODO Auto-generated method stub
		this.usuarioDAO = DAOFactory.buildUsuarioDAO(); 
	}

	public void saveUser(BCHATMKT001_USER_DS usuario) {
		// TODO Auto-generated method stub
		BCHATMKT001_USER_PERMISSION_DS permissao = new BCHATMKT001_USER_PERMISSION_DS();
		
		if(this.listUser().isEmpty()) {
			
			permissao.setPermissao("ROLE_ADMINISTRADOR");
			usuario.setPermissao(permissao);
		}
		
		this.usuarioDAO.saveUser(usuario);
	}

//	public void savePermissao(BCHATMKT001_USER_PERMISSION_DS permissao) {
//    TODO Auto-generated method stub
//	
//	}

	public void deleteUser(BCHATMKT001_USER_DS usuario) {
		// TODO Auto-generated method stub
		this.usuarioDAO.deleteUser(usuario);
	}

	public BCHATMKT001_USER_DS consultUser(Integer id) {
		// TODO Auto-generated method stub
		return this.usuarioDAO.consultUser(id);
	}

	public List<BCHATMKT001_USER_DS> listUser() {
		// TODO Auto-generated method stub
		return this.usuarioDAO.listUser();
	}
}

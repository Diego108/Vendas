package org.vendas.util;

import org.vendas.business.usuario.UsuarioHibernate;
import org.vendas.model.dao.UsuarioDAO;

public class DAOFactory {

	public static UsuarioDAO buildUsuarioDAO() {
		
		UsuarioHibernate usuarioDAOHibernate = new UsuarioHibernate();
		usuarioDAOHibernate.setSession(HibernateUtil.getSessionFactory().openSession());
		
		return usuarioDAOHibernate;
	}
}

package org.vendas.business.usuario;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.vendas.model.dao.UsuarioDAO;
import org.vendas.model.entity.BCHATMKT001_USER_DS;

@SuppressWarnings({ "deprecation", "unchecked" })
public class UsuarioHibernate implements UsuarioDAO{

	private Session sessao;
	
	@Override
	public void setSession(Session sessao) {
		// TODO Auto-generated method stub
		this.sessao = sessao;
	}
	
	@Override
	public void saveUser(BCHATMKT001_USER_DS usuario) {
		// TODO Auto-generated method stub
		this.sessao.save(usuario);
	}

//	@Override
//	public void savePermissao(BCHATMKT001_USER_PERMISSION_DS permissao) {
		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void deleteUser(BCHATMKT001_USER_DS usuario) {
		// TODO Auto-generated method stub
		this.sessao.delete(usuario);
	}

	@Override
	public BCHATMKT001_USER_DS consultUser(Integer id) {
		// TODO Auto-generated method stub
		SQLQuery consulta = this.sessao.createSQLQuery("SELECT * FROM BCHATMKT001_USER_DS bc WHERE bc.id = :id");
		consulta.setParameter("id", id);
		
		return (BCHATMKT001_USER_DS) consulta.getSingleResult();
	}

	@Override
	public List<BCHATMKT001_USER_DS> listUser() {
		// TODO Auto-generated method stub

		return this.sessao.createCriteria(BCHATMKT001_USER_DS.class).list();
	}
}

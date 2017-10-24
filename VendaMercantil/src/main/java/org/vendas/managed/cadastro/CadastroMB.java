package org.vendas.managed.cadastro;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.hibernate.Session;
import org.vendas.daoFactory.HibernateUtil;

@ManagedBean(name="cadastroMB")
@RequestScoped
public class CadastroMB {

	Session sessao = null;
	
	public String novo(){
		
		sessao = HibernateUtil.getSessionFactory().openSession();
		
		System.out.println("Conexao aberta");
		
		return "cadastro.jsf";
	}
}

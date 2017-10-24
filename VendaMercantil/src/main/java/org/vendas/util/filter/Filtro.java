package org.vendas.util.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.vendas.daoFactory.HibernateUtil;

@WebFilter(urlPatterns = {"*.jsf"})
public class Filtro implements Filter{

	private SessionFactory sf;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		sf = HibernateUtil.getSessionFactory();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		Session sessao = this.sf.getCurrentSession();
		
		Transaction transacao = null;
		
		try{
			
			transacao = sessao.beginTransaction();
			chain.doFilter(request, response);
			transacao.commit();
			
			if(sessao.isOpen()){
				sessao.close();
			}
		}catch(Throwable ex){
			
			try{
				
				if(transacao.isActive()){
					transacao.rollback();
				}
			}catch(Throwable t){
				
				t.printStackTrace();
			}
			
			throw new ServletException(ex);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}

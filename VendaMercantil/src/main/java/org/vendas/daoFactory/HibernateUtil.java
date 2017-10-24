package org.vendas.daoFactory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory(){
		
		try{	
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
		
			StandardServiceRegistryBuilder registradorDeServico = new StandardServiceRegistryBuilder();
			registradorDeServico.applySettings(cfg.getProperties());
		
			StandardServiceRegistry servico = registradorDeServico.build();
		
			return cfg.buildSessionFactory(servico);
		}catch(Throwable e){
			
			System.out.println("Criação inicial do de conexão falhou" + e.getMessage());
			throw new ExceptionInInitializerError(e); 
		}
	}
	
	
	public static SessionFactory getSessionFactory(){
		
		return sessionFactory;
	}
}

package org.vendas.bean.usuario;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.vendas.business.usuario.UsuarioRN;
import org.vendas.model.entity.BCHATMKT001_USER_DS;

@ManagedBean(name="cadastroMB")
@RequestScoped
public class CadastroMB {

	private BCHATMKT001_USER_DS usuario = new BCHATMKT001_USER_DS();
	
	public String novo(){
		
		System.out.println("Conexao aberta");
		
		return "/publico/login.jsf";
	}
	
	public String cadastrar(){
		
		if(usuario.equals(null) || usuario == null) {
			
			FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_INFO,
																		  		 "Algo está faltando em seu cadastro",
																		  		 "Algo está errado com seu cadastro"));
		}
		
		UsuarioRN business = new UsuarioRN();
		business.saveUser(usuario);
		
		return "/publico/login.jsf";
	}

	public BCHATMKT001_USER_DS getUsuario() {
		return usuario;
	}

	public void setUsuario(BCHATMKT001_USER_DS usuario) {
		this.usuario = usuario;
	}
}

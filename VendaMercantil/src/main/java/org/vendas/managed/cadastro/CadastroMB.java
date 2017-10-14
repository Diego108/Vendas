package org.vendas.managed.cadastro;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="cadastroMB")
@RequestScoped
public class CadastroMB {

	public String novo(){
		
		return "cadastro.jsf";
	}
}

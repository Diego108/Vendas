package org.vendas.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BCHATMKT001_USER_PERMISSION_DS")
public class BCHATMKT001_USER_PERMISSION_DS implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -889840901461994815L;

	@Id
	@GeneratedValue()
	@Column(name = "id")
	private Integer id;

	@JoinColumn(name = "usuario")
	private BCHATMKT001_USER_DS usuario;
	
	@Column(name = "permissao")
	private String permissao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BCHATMKT001_USER_DS getUsuario() {
		return usuario;
	}

	public void setUsuario(BCHATMKT001_USER_DS usuario) {
		this.usuario = usuario;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((permissao == null) ? 0 : permissao.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BCHATMKT001_USER_PERMISSION_DS other = (BCHATMKT001_USER_PERMISSION_DS) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (permissao == null) {
			if (other.permissao != null)
				return false;
		} else if (!permissao.equals(other.permissao))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
}

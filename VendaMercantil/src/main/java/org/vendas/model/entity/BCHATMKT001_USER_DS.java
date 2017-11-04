package org.vendas.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BCHATMKT001_USER_DS")
public class BCHATMKT001_USER_DS implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6484265838827385643L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nome", length= 50, nullable = false)
	private String nome;
	
	@Column(name = "login", nullable = false)
	private String login;
	
	@Column(name = "email", nullable = true)
	private String email;
	
	@Column(name = "senha", nullable = false)
	private String senha;
	
	@Column(name = "nascimento", nullable = false)
	private Date nascimento;
	
	@Column(name = "idioma", nullable = false)
	private String idioma;
	
	@Column(name = "ativo", nullable = false)
	private boolean ativo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "permissao")
	private BCHATMKT001_USER_PERMISSION_DS permissao;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (ativo ? 1231 : 1237);
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idioma == null) ? 0 : idioma.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nascimento == null) ? 0 : nascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
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
		BCHATMKT001_USER_DS other = (BCHATMKT001_USER_DS) obj;
		if (ativo != other.ativo)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idioma == null) {
			if (other.idioma != null)
				return false;
		} else if (!idioma.equals(other.idioma))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (nascimento == null) {
			if (other.nascimento != null)
				return false;
		} else if (!nascimento.equals(other.nascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}

	public BCHATMKT001_USER_PERMISSION_DS getPermissao() {
		return permissao;
	}

	public void setPermissao(BCHATMKT001_USER_PERMISSION_DS permissao) {
		this.permissao = permissao;
	}
}

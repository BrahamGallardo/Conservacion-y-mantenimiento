package com.access.dep.entidad;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;

//import com.access.dep.entidad.Rol;

import javax.persistence.JoinColumn;

@Entity
public class Usuario implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9051478822249708486L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	private int id;
	
	@Column 
	private int idTrabajador;
	@Column(unique = true) 
	private String nombreDeUsuario;
	@Column
	private String contrasena;
	
	@Transient 
	private String confirmPassword;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="usuario_roles"
		,joinColumns=@JoinColumn(name="usuario_id")
		,inverseJoinColumns=@JoinColumn(name="rol_id"))
	private Set<Rol> roles;
	
	public Usuario() {	}
	
	public Usuario(int id) {
		this.id = id;
	}
	
	//Getters, Setters, HashCode, Equals & ToString Functions

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}

	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((confirmPassword == null) ? 0 : confirmPassword.hashCode());
		result = prime * result + ((contrasena == null) ? 0 : contrasena.hashCode());
		result = prime * result + id;
		result = prime * result + idTrabajador;
		result = prime * result + ((nombreDeUsuario == null) ? 0 : nombreDeUsuario.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
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
		Usuario other = (Usuario) obj;
		if (confirmPassword == null) {
			if (other.confirmPassword != null)
				return false;
		} else if (!confirmPassword.equals(other.confirmPassword))
			return false;
		if (contrasena == null) {
			if (other.contrasena != null)
				return false;
		} else if (!contrasena.equals(other.contrasena))
			return false;
		if (id != other.id)
			return false;
		if (idTrabajador != other.idTrabajador)
			return false;
		if (nombreDeUsuario == null) {
			if (other.nombreDeUsuario != null)
				return false;
		} else if (!nombreDeUsuario.equals(other.nombreDeUsuario))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", idTrabajador=" + idTrabajador + ", nombreDeUsuario=" + nombreDeUsuario
				+ ", contrasena=" + contrasena + ", confirmPassword=" + confirmPassword + ", roles=" + roles + "]";
	}
	
	
	
}
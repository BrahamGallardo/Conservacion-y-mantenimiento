package com.access.dep.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Trabajadores implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1100882871290291263L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	@Column 
	private Long idtrabajador;

	@Column
	@NotBlank
	@Size(min=3,max=13,message="El tamaño debe se de al menos 3 letras y máximo de 15")
	private String nombre_trabajador;
	
	@Column 
	@NotBlank
	@Email
	private String email;
	
	@Column 
	private String telefono;
	
	@Column
	@NotBlank
	private Long idtipo_trabajador;
	
	@Column
	@NotBlank
	private Long idrol;
	
	@Column
	@NotBlank
	private Long idestado;
	
	@Column
	@NotBlank
	private Long idhorario;
	
	@Column 
	private String nombre_de_usuario;
	
	@Column 
	private String contrasena;
	
	public Trabajadores() {	}
	
	public Trabajadores(Long idtrabajador) {
		this.idtrabajador = idtrabajador;
	}

	public Long getIdtrabajador() {
		return idtrabajador;
	}

	public void setIdtrabajador(Long idtrabajador) {
		this.idtrabajador = idtrabajador;
	}

	public String getNombre_trabajador() {
		return nombre_trabajador;
	}

	public void setNombre_trabajador(String nombre_trabajador) {
		this.nombre_trabajador = nombre_trabajador;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Long getIdtipo_trabajador() {
		return idtipo_trabajador;
	}

	public void setIdtipo_trabajador(Long idtipo_trabajador) {
		this.idtipo_trabajador = idtipo_trabajador;
	}

	public Long getIdrol() {
		return idrol;
	}

	public void setIdrol(Long idrol) {
		this.idrol = idrol;
	}

	public Long getIdestado() {
		return idestado;
	}

	public void setIdestado(Long idestado) {
		this.idestado = idestado;
	}

	public Long getIdhorario() {
		return idhorario;
	}

	public void setIdhorario(Long idhorario) {
		this.idhorario = idhorario;
	}

	public String getNombre_de_usuario() {
		return nombre_de_usuario;
	}

	public void setNombre_de_usuario(String nombre_de_usuario) {
		this.nombre_de_usuario = nombre_de_usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contrasena == null) ? 0 : contrasena.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((idestado == null) ? 0 : idestado.hashCode());
		result = prime * result + ((idhorario == null) ? 0 : idhorario.hashCode());
		result = prime * result + ((idrol == null) ? 0 : idrol.hashCode());
		result = prime * result + ((idtipo_trabajador == null) ? 0 : idtipo_trabajador.hashCode());
		result = prime * result + ((idtrabajador == null) ? 0 : idtrabajador.hashCode());
		result = prime * result + ((nombre_de_usuario == null) ? 0 : nombre_de_usuario.hashCode());
		result = prime * result + ((nombre_trabajador == null) ? 0 : nombre_trabajador.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
		Trabajadores other = (Trabajadores) obj;
		if (contrasena == null) {
			if (other.contrasena != null)
				return false;
		} else if (!contrasena.equals(other.contrasena))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idestado == null) {
			if (other.idestado != null)
				return false;
		} else if (!idestado.equals(other.idestado))
			return false;
		if (idhorario == null) {
			if (other.idhorario != null)
				return false;
		} else if (!idhorario.equals(other.idhorario))
			return false;
		if (idrol == null) {
			if (other.idrol != null)
				return false;
		} else if (!idrol.equals(other.idrol))
			return false;
		if (idtipo_trabajador == null) {
			if (other.idtipo_trabajador != null)
				return false;
		} else if (!idtipo_trabajador.equals(other.idtipo_trabajador))
			return false;
		if (idtrabajador == null) {
			if (other.idtrabajador != null)
				return false;
		} else if (!idtrabajador.equals(other.idtrabajador))
			return false;
		if (nombre_de_usuario == null) {
			if (other.nombre_de_usuario != null)
				return false;
		} else if (!nombre_de_usuario.equals(other.nombre_de_usuario))
			return false;
		if (nombre_trabajador == null) {
			if (other.nombre_trabajador != null)
				return false;
		} else if (!nombre_trabajador.equals(other.nombre_trabajador))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trabajadores [idtrabajador=" + idtrabajador + ", nombre_trabajador=" + nombre_trabajador + ", email="
				+ email + ", telefono=" + telefono + ", idtipo_trabajador=" + idtipo_trabajador + ", idrol=" + idrol
				+ ", idestado=" + idestado + ", idhorario=" + idhorario + ", nombre_de_usuario=" + nombre_de_usuario
				+ ", contrasena=" + contrasena + "]";
	}

	
	

}

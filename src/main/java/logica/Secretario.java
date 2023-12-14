/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author TEKTRONIC
 */
@Entity
public class Secretario extends Persona implements Serializable{
    //private int id_secretario;
	private String sector;
	@OneToOne
	private Usuario unUsuario;
	public Secretario() {
	}
	public Secretario(String sector, Usuario unUsuario,int id, String dni, String nombre, String apellido, String direccion, Date fecha_nac) {
		super(id, dni, nombre, apellido, direccion, fecha_nac);
		this.sector = sector;
		this.unUsuario = unUsuario;
	}
	
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public Usuario getUnUsuario() {
		return unUsuario;
	}
	public void setUnUsuario(Usuario unUsuario) {
		this.unUsuario = unUsuario;
	}
	
}

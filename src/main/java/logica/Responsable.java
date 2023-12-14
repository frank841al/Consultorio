/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author TEKTRONIC
 */
@Entity
public class Responsable extends Persona implements Serializable{
    private String tipo_responsable;

	public Responsable() {

		// TODO Auto-generated constructor stub
	}

	public Responsable( String tipo_responsable,int id,String dni, String nombre, String apellido, String direccion, Date fecha_nac) {
		super(id,dni, nombre, apellido, direccion, fecha_nac);
		this.tipo_responsable = tipo_responsable;
	}



	public String getTipo_responsable() {
		return tipo_responsable;
	}

	public void setTipo_responsable(String tipo_responsable) {
		this.tipo_responsable = tipo_responsable;
	}
}

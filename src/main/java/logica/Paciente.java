/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author TEKTRONIC
 */
@Entity
public class Paciente extends Persona implements Serializable{
        private int id_paciente;
	private boolean tiene_OS;
	private String tipoSangre;
	@OneToOne
	private Responsable unResponsable;
	@OneToMany(mappedBy="pacien")
	private List<Turno> listaTurnos;
	public Paciente() {
	}
	public Paciente(int id_paciente,boolean tiene_OS,String tipoSangre,Responsable unResponsable,List<Turno> listaTurnos, int id,String dni, String nombre, String apellido, String direccion, Date fecha_nac) {
		super(id, dni, nombre, apellido, direccion, fecha_nac);
		this.id_paciente=id_paciente;
		this.tiene_OS= tiene_OS;
		this.tipoSangre= tipoSangre;
		this.unResponsable= unResponsable;
		this.listaTurnos= listaTurnos;	
	}
	
	public Responsable getUnResponsable() {
		return unResponsable;
	}
	public void setUnResponsable(Responsable unResponsable) {
		this.unResponsable = unResponsable;
	}
	public List<Turno> getListaTurnos() {
		return listaTurnos;
	}
	public void setListaTurnos(List<Turno> listaTurnos) {
		this.listaTurnos = listaTurnos;
	}
	public int getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}
	public boolean isTiene_OS() {
		return tiene_OS;
	}
	public void setTiene_OS(boolean tiene_OS) {
		this.tiene_OS = tiene_OS;
	}
	public String getTipoSangre() {
		return tipoSangre;
	}
	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}
}

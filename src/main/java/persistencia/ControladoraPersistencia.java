/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author TEKTRONIC
 */
public class ControladoraPersistencia {
    
   HorarioJpaController horaJPA ;
    OdontologoJpaController odontoJPA;
    PacienteJpaController pacJPA ;
    PersonaJpaController persJPA ;
    ResponsableJpaController respJPA ;
    SecretarioJpaController secreJPA ;
    TurnoJpaController turnJPA ;
    UsuarioJpaController usuJPA ;
    
    
    public ControladoraPersistencia(){
    usuJPA = new UsuarioJpaController();
    turnJPA = new TurnoJpaController();
    secreJPA = new SecretarioJpaController();
    respJPA = new ResponsableJpaController();
    persJPA = new PersonaJpaController();
    pacJPA = new PacienteJpaController();
    odontoJPA = new OdontologoJpaController();
    horaJPA = new HorarioJpaController();
    }
    public void crearUsuario(Usuario usu){
        usuJPA.create(usu);
    }
     public List<Usuario> getUsuarios(){
      return usuJPA.findUsuarioEntities();
  }

    public void borrarUsuario(int id) {
       try {
           usuJPA.destroy(id);
       } catch (NonexistentEntityException ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }

    public Usuario traerUsuario(int id) {
      return  usuJPA.findUsuario(id);
      
      
    }

    public void editarUsuario(Usuario usu) {
       try {
           usuJPA.edit(usu);
       } catch (Exception ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}

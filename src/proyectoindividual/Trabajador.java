/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoindividual;

import javax.swing.JOptionPane;

/**
 *
 * @author Hugo
 */
public class Trabajador extends Persona {

    private String puesto;
    private String nIdentificacion;

    public Trabajador(String puesto, String nombre, String apellidos, String DNI, String ciudad, String contacto, String contraseña) {
        super(nombre, apellidos, DNI, ciudad, contacto, contraseña);
        this.puesto = puesto;
    }
    
    public Trabajador(){
        
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getnIdentificacion() {
        return nIdentificacion;
    }

    public void setnIdentificacion(String nIdentificacion) {
        this.nIdentificacion = nIdentificacion;
    }
    
    @Override
     public void comprobarNombre() {
        JOptionPane.showMessageDialog(null, "Debes introducir un nombre sin números");
    }

    @Override
    public void comprobarApellidos() {
        JOptionPane.showMessageDialog(null, "Debes introducir un apellido sin números");
    }

    @Override
    public void comprobarContacto() {
        JOptionPane.showMessageDialog(null, "Debes introducir un teléfono válido");
    }

   

    public void comprobarCiudad() {
        JOptionPane.showMessageDialog(null, "Debes introducir una ciudad sin números");
    }
    
    
    @Override
    public void comprobarCamposVacios(){
         JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos");
    }
    
    
    public void comprobarCampos(){
        
    }
    
    @Override
    public void comprobarPuesto(){
        JOptionPane.showMessageDialog(null, "Debes seleccionar un puesto de trabajo");
    }
    
     @Override
    public void comprobarDNI(){
        JOptionPane.showMessageDialog(null, "Su DNI coincide con otro registro de un trabajador en la base de datos");
    }
    
     public void comprobarDNI2(){
        JOptionPane.showMessageDialog(null, "Su DNI coincide con otro registro de un cliente en la base de datos");
    }

}

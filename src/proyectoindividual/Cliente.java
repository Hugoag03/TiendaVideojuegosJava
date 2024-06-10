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
public class Cliente extends Persona {

    private String nombreUsuario;
    private String codigoPostal;

    public Cliente(String nombreUsuario, String nombre, String apellidos, String DNI, String ciudad, String codigoPostal, String contacto, String contraseña) {
        super(nombre, apellidos, DNI, ciudad, contacto, contraseña);
        this.nombreUsuario = nombreUsuario;
        this.codigoPostal = codigoPostal;
    }

    public Cliente() {

    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void comprobarCampos() {
        JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos");
    }

    @Override
    public void comprobarCamposVacios() {
        JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos");
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

    public void comprobarCP() {
        JOptionPane.showMessageDialog(null, "Debes introducir un código postal válido");
    }

    @Override
    public void comprobarCiudad() {
        JOptionPane.showMessageDialog(null, "Debes introducir una ciudad sin números");
    }
    
    @Override
    public void comprobarPuesto(){
    }
    
     @Override
    public void comprobarDNI(){
        JOptionPane.showMessageDialog(null, "Su DNI coincide con otro registro de un cliente en la base de datos");
    }
    
    public void comprobarDNI2(){
        JOptionPane.showMessageDialog(null, "Su DNI coincide con otro registro de un trabajador en la base de datos");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoindividual;

/**
 *
 * @author Hugo
 */
public abstract class Persona implements MetodosComprobacion{

    private String nombre;
    private String apellidos;
    private String DNI;
    private String pais;
    private String ciudad;
    private String codigoPostal;
    private String contacto;
    private String contraseña;

    public Persona(String nombre, String apellidos, String DNI, String ciudad, String contacto, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.ciudad = ciudad;
        this.contacto = contacto;
    }
    
    public Persona(){
        
    }
    
    public abstract void comprobarNombre();
    
    public abstract void comprobarApellidos();
    
    public abstract void comprobarCiudad();
    
    public abstract void comprobarContacto();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
}

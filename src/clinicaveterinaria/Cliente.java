/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import java.util.ArrayList;
import java.util.List;

//quite este comentario

/**
 *
 * @author elinote
 */
public class Cliente{
    
    private int id_cliente;
    private long dni;
    private String apellido;
    private String nombre;
    private String direccion;
    private String telefono;
    private String personaAlternativa;
  

    public Cliente(int id_cliente, long dni, String apellido, String nombre, String direccion, String telefono, String personaAlternativa) {
        this.id_cliente = id_cliente;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personaAlternativa = personaAlternativa;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPersonaAlternativa() {
        return personaAlternativa;
    }

    public void setPersonaAlternativa(String personaAlternativa) {
        this.personaAlternativa = personaAlternativa;
    }

 
    

  
    
  
}

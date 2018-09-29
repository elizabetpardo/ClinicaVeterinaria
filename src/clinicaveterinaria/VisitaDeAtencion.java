/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import java.util.Date;

/**
 *
 * @author elinote
 */
public class VisitaDeAtencion {
   private int id_visitaA;
   private  Mascota mascota;
   private Tratamiento tratamiento;
   private Cliente cliente;
   private Date fecha;
   private String detalle;

    public VisitaDeAtencion(int id, Mascota mascota, Tratamiento tratamiento, Cliente cliente, Date fecha, String detalle) {
        this.id_visitaA = id;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.cliente = cliente;
        this.fecha = fecha;
        this.detalle = detalle;
    }

    public int getId_visitaA() {
        return id_visitaA;
    }

    public void setId_visitaA(int id_visitaA) {
        this.id_visitaA = id_visitaA;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
   
   
  
  
   
  
}
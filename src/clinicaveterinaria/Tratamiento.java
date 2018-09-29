/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author elinote
 */
public class Tratamiento {
    private int id_tratamiento;
    private String codigo;
    private int tipo;
    private String descripcion;
    private double importe;
    private boolean activo;

    public Tratamiento(int id_tratamiento, String codigo, int tipo, String descripcion, double importe, boolean activo) {
        this.id_tratamiento = id_tratamiento;
        this.codigo = codigo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.activo = activo;
    }

    public int getId_tratamiento() {
        return id_tratamiento;
    }

    public void setId_tratamiento(int id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
   public void cambiarTratamiento()
   {
       if(activo == true)
           activo=false;
       else
           activo=true;
   };
    
}

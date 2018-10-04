/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Modelo;



/**
 *
 * @author elinote
 */
public class Tratamiento {
    private int id_tratamiento=-1;
    private String cod_tratamiento;
    private int tipo;
    private String descripcion;
    private double importe;
    private boolean activo;

    public Tratamiento() {
       
    }

    public Tratamiento(int id_tratamiento, String codigo, int tipo, String descripcion, double importe, boolean activo) {
        this.id_tratamiento = id_tratamiento;
        this.cod_tratamiento = codigo;
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

    public String getCod_tratamiento() {
        return cod_tratamiento;
    }

    public void setCod_tratamiento(String codigo) {
        this.cod_tratamiento = codigo;
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

    public boolean getActivo() {
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

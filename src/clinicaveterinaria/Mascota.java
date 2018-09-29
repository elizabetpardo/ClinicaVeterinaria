/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author elinote
 */
public abstract class Mascota {
    private int id_mascota;
    private Cliente cliente;
    private int codigo;
    private String alias;
    private String sexo;
    private String especie;
    private String raza;
    private String colorPelo;
    private Date fechNac;
    private double pesoPromedio;
    private double pesoActual;
   
    

    public Mascota(int id_mascota, int codigo, String alias, String sexo, String especie, String raza, Date fechNac, double pesoPromedio, double pesoActual) {
        this.id_mascota = id_mascota;
        this.codigo = codigo;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.fechNac = fechNac;
        this.pesoPromedio = pesoPromedio;
        this.pesoActual = pesoActual;
    }
    
    
    
    public abstract void PesoPromedio();

    public int getId() {
        return id_mascota;
    }

    public void setId(int id) {
        this.id_mascota = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public Date getFechNac() {
        return fechNac;
    }

    public void setFechNac(Date fechNac) {
        this.fechNac = fechNac;
    }

    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }
    
    
}

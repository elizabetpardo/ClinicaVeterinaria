/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Modelo;


import java.util.Date;

/**
 *
 * @author elinote
 */
public abstract class Mascota {
    private int id_mascota;
    private Cliente cliente;
    private int cod_mascota;
    private String alias;
    private String sexo;
    private String especie;
    private String raza;
    private String color_pelo;
    private Date fecha_nac;
    private double peso_promedio;
    private double peso_actual;

    public Mascota(int id_mascota, Cliente cliente, int codigo, String alias, String sexo, String especie, String raza, String colorPelo, Date fechNac, double pesoPromedio, double pesoActual) {
        this.id_mascota = id_mascota;
        this.cliente = cliente;
        this.cod_mascota = codigo;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.color_pelo = colorPelo;
        this.fecha_nac = fechNac;
        this.peso_promedio = pesoPromedio;
        this.peso_actual = pesoActual;
    }
   
    
    public abstract void PesoPromedio();

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id) {
        this.id_mascota = id;
    }

    public int getCodMascota() {
        return cod_mascota;
    }

    public void setCodigo(int codigo) {
        this.cod_mascota = codigo;
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

    public String getColor_pelo() {
        return color_pelo;
    }

    public void setColor_pelo(String colorPelo) {
        this.color_pelo = colorPelo;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fechNac) {
        this.fecha_nac = fechNac;
    }

    public double getPeso_promedio() {
        return peso_promedio;
    }

    public void setPeso_promedio(double pesoPromedio) {
        this.peso_promedio = pesoPromedio;
    }

    public double getPeso_actual() {
        return peso_actual;
    }

    public void setPeso_actual(double pesoActual) {
        this.peso_actual = pesoActual;
    }
    
    
}

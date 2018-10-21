/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Modelo;


import java.time.LocalDate;
import java.util.Date;


/**
 *
 * @author elinote
 */
public class Mascota {
    private int id_mascota=-1;
    private Cliente cliente;
    private int cod_mascota;
    private String alias;
    private String sexo;
    private String especie;
    private String raza;
    private String color_pelo;
    private LocalDate fecha_nac;
    private double peso_promedio;
    private double peso_actual;
    

    public Mascota() {
      
    }
   
    public Mascota(int id_mascota, Cliente cliente, int codigo, String alias, String sexo, String especie, String raza,String colorpelo, LocalDate fecha_nac, double pesoPromedio, double pesoActual) {
        this.id_mascota = id_mascota;
        this.cliente = cliente;
        this.cod_mascota = codigo;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.color_pelo=colorpelo;
        this.fecha_nac = fecha_nac;
        this.peso_promedio = pesoPromedio;
        this.peso_actual = pesoActual;
    }
    
    public Mascota(Cliente cliente, int codigo, String alias, String sexo, String especie, String raza,String colorpelo, LocalDate fecha_nac, double pesoPromedio, double pesoActual) {
        this.cliente = cliente;
        this.cod_mascota = codigo;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.color_pelo=colorpelo;
        this.fecha_nac = fecha_nac;
        this.peso_promedio = pesoPromedio;
        this.peso_actual = pesoActual;
    }
  
    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id) {
        this.id_mascota = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCod_mascota() {
        return cod_mascota;
    }

    public void setCod_mascota(int codigo) {
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

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
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
    
    /*public void PesoPromedio(Mascota mascota){ //este metodo debe ir en VisitaDeAtencion
        if(mascota.getPeso_promedio() == 0)
            mascota.setPeso_promedio(mascota.getPeso_actual());
        else
            mascota.setPeso_promedio((mascota.getPeso_actual()+ mascota.getPeso_promedio())/2);
    } */
    
}
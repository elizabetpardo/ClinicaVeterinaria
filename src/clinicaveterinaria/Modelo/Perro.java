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
public class Perro extends Mascota{

    public Perro(int id_mascota, int codigo, String alias, String sexo, String especie, String raza, Date fechNac, double pesoPromedio, double pesoActual) {
        super(id_mascota, codigo, alias, sexo, especie, raza, fechNac, pesoPromedio, pesoActual);
    }
    
     public void PesoPromedio(){};
}

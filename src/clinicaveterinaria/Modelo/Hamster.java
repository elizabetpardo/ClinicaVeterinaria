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
public class Hamster extends Mascota {

    public Hamster(int id_mascota, Cliente cliente, int codigo, String alias, String sexo, String especie, String raza, String colorPelo, Date fechNac, double pesoPromedio, double pesoActual) {
        super(id_mascota, cliente, codigo, alias, sexo, especie, raza, colorPelo, fechNac, pesoPromedio, pesoActual);
    }

  
    
     public void PesoPromedio(){};
}

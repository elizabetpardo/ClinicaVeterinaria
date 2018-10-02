/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author elinote
 */
public class VisitasData {
     private Connection connection = null;
     private Conexion conexion;
     
      public VisitasData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
       public void guardarVisita(VisitaDeAtencion visita){
        try {
            
            String sql = "INSERT INTO cursada (id_mascota, id_tratamiento,fecha,detalle) VALUES ( ? , ? , ? ,?);";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, visita.getMascota().getId_mascota());
            statement.setInt(2, visita.getTratamiento().getId_tratamiento());
            statement.setDate(3, (Date) visita.getFecha());
            statement.setString(4,visita.getDetalle());
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                visita.setId_visita(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una visita");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una visita: " + ex.getMessage());
        }
    }
    
    
}

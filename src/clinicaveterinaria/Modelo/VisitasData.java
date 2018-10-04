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
import java.util.ArrayList;
import java.util.List;

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
            
            String sql = "INSERT INTO visitadeatencion (id_mascota, id_tratamiento,fecha,detalle) VALUES ( ? , ? , ? ,?);";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, visita.getMascota().getId_mascota());
            statement.setInt(2, visita.getTratamiento().getId_tratamiento());
            statement.setDate(3, Date.valueOf(visita.getFecha()));
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
    
      public List<VisitaDeAtencion> obtenerVisitas(){
        List<VisitaDeAtencion> visitas = new ArrayList<VisitaDeAtencion>();
            

        try {
            String sql = "SELECT * FROM visitadeatencion;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            VisitaDeAtencion visita;
            while(resultSet.next()){
                visita = new VisitaDeAtencion();
                visita.setId_visita(resultSet.getInt("id"));
                
                Mascota m=buscarMascota(resultSet.getInt("id_mascota"));
                visita.setMascota(m);
                
                Tratamiento t=buscarTratamiento(resultSet.getInt("id_tratamiento"));
                visita.setTratamiento(t);
                visita.setFecha(resultSet.getDate("fecha").toLocalDate());
                visita.setDetalle(resultSet.getString("detalle"));
               

                visitas.add(visita);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las visitas: " + ex.getMessage());
        }
        
        
        return visitas;
    }
      public List<VisitaDeAtencion> obtenerVisitasXMascota(int id){
        List<VisitaDeAtencion> visitas = new ArrayList<VisitaDeAtencion>();
            

        try {
            String sql = "SELECT * FROM visitadeatencion WHERE id_mascota = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            VisitaDeAtencion visita;
            while(resultSet.next()){
                visita = new VisitaDeAtencion();
                visita.setId_visita(resultSet.getInt("id_visita"));
                
                Mascota m=buscarMascota(resultSet.getInt("id_mascota"));
                visita.setMascota(m);
                
                Tratamiento t=buscarTratamiento(resultSet.getInt("id_tratamiento"));
                visita.setTratamiento(t);
                visita.setFecha(resultSet.getDate("fecha").toLocalDate());
                visita.setDetalle(resultSet.getString("detalle"));
               

                visitas.add(visita);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las visitas de atención: " + ex.getMessage());
        }
        
        
        return visitas;
    }
   /*   public List<VisitaDeAtencion> obtenerVisitasMismoTratamiento(int tipo){
            List<VisitaDeAtencion> visitas = new ArrayList<VisitaDeAtencion>();
            
         try {
            String sql = "SELECT* FROM visitadeatencion, tratamiento"
                    + " WHERE tratamiento.tipo = materia.id\n" +
                         "and cursada.idAlumno = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, tipo);
            ResultSet resultSet = statement.executeQuery();
            VisitaDeAtencion visita;
            while(resultSet.next()){
                visita = new VisitaDeAtencion();
                visita.getMascota(resultSet.getInt("id_mascota"));
                visita.setNombre(resultSet.getString("nombre"));
                visitas.add(visita);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return visitas;
      
    }*/
      public Mascota buscarMascota(int id){
    
        MascotaData ad=new MascotaData(conexion);
        
        return ad.buscarMascota(id);
        
    }
      public Tratamiento buscarTratamiento(int id){
    
        TratamientoData md=new TratamientoData(conexion);
        return md.buscarTratamiento(id);
    
    }
        
        
    
        
}

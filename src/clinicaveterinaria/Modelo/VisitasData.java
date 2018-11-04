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
            
            String sql = "INSERT INTO visitadeatencion (id_mascota, id_tratamiento,fecha,detalle,peso_actual,peso_promedio) VALUES ( ? , ? , ? ,? ,? ,?);";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, visita.getMascota().getId_mascota());
            statement.setInt(2, visita.getTratamiento().getId_tratamiento());
            statement.setDate(3, Date.valueOf(visita.getFecha()));
            statement.setString(4,visita.getDetalle());
            statement.setDouble(5, visita.getPeso_actual());
            statement.setDouble(6, visita.getPeso_promedio());
            
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                visita.setId_visita(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una visita");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al in una visita de atencion: " + ex.getMessage());
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
                visita.setPeso_actual(resultSet.getDouble("peso_actual"));
                visita.setPeso_promedio(resultSet.getDouble("peso_promedio"));
                 
                
              
              visitas.add(visita);
               
            }    
             
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las visitas de atención: " + ex.getMessage());
        }
        
        
        return visitas;
    }
      public double PromediarPeso(Mascota mascota, int actualizacion){
          //int cantVisitas=0;
         // int cant=0;
          double pesos = 0;
          double promedio;
          int cantVisitas=obtenerVisitasXMascota(mascota.getId_mascota()).size();
          List<VisitaDeAtencion> visitas ;
          visitas=obtenerVisitasXMascota(mascota.getId_mascota());
          
          if(cantVisitas == 0)
                  promedio = mascota.getPeso_actual();
          else{
              for(int i=0; i < cantVisitas ;i++){
                  
              pesos+=visitas.get(i).getPeso_actual();
                  
          
               }
              
              if(actualizacion == 0)
                promedio= (pesos + mascota.getPeso_actual())/(cantVisitas+1) ;  // promedio para guardar
              else
                promedio= (pesos - visitas.get(cantVisitas-1).getPeso_actual() + mascota.getPeso_actual())/(cantVisitas) ; // promedio para actualizar
              
          }
          
          
        return promedio;
    } 
    
     public List<VisitaDeAtencion> obtenerVisitasMismoTratamiento(int tipo){
            List<VisitaDeAtencion> visitas = new ArrayList<VisitaDeAtencion>();
            
        try {
            String sql = "SELECT * FROM visitadeatencion,tratamiento WHERE tipo= ? AND tratamiento.id_tratamiento = visitadeatencion.id_tratamiento;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, tipo);
            ResultSet resultSet = statement.executeQuery();
            VisitaDeAtencion visita;
            while(resultSet.next()){
                visita = new VisitaDeAtencion();
                visita.setId_visita(resultSet.getInt("id_visita"));
                
                Tratamiento t=buscarTratamiento(resultSet.getInt("id_tratamiento"));
                visita.setTratamiento(t);
                
                Mascota m=buscarMascota(resultSet.getInt("id_mascota"));
                visita.setMascota(m);
                
                visita.setFecha(resultSet.getDate("fecha").toLocalDate());
                visita.setDetalle(resultSet.getString("detalle"));
                visita.setPeso_actual(resultSet.getDouble("peso_actual"));
                visita.setPeso_promedio(resultSet.getDouble("peso_promedio"));
                visitas.add(visita);
            }

            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las visitas: " + ex.getMessage());
        }
        
        
        return visitas;
      
    }
    
      
      public void borrarVisita(int id){
    
        try {
            
            String sql = "DELETE FROM visitadeatencion WHERE id_visita =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
        
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error eliminar una visita: " + ex.getMessage());
        }
        
        
        
        
    
    }
      public void actualizarVisita(VisitaDeAtencion visita)
      { Mascota mascota = visita.getMascota();
         try {
            
            String sql = "UPDATE visitadeatencion SET id_mascota = ?, id_tratamiento = ?, fecha = ?, detalle = ?,peso_actual= ?, peso_promedio = ? WHERE id_visita = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setInt(1, visita.getMascota().getId_mascota());
            statement.setInt(2, visita.getTratamiento().getId_tratamiento());
            statement.setDate(3,Date.valueOf(visita.getFecha()));
            statement.setString(4, visita.getDetalle());
            statement.setDouble(5,visita.getPeso_actual());
            statement.setDouble(6, visita.getPeso_promedio());
            statement.setInt(7, visita.getId_visita());
            
            statement.executeUpdate();
            
          
            statement.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar una visita de atención: " + ex.getMessage());
        }
      
      }
      public VisitaDeAtencion buscarVisita(int id){
    
        VisitaDeAtencion visita=null;
    try {
            
            String sql = "SELECT * FROM visitadeatencion WHERE id_visita =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                visita = new VisitaDeAtencion();
                visita.setId_visita(resultSet.getInt("id_visita"));
                
                Mascota m= buscarMascota(resultSet.getInt("id_mascota"));
                visita.setMascota(m);
                
                Tratamiento t= buscarTratamiento(resultSet.getInt("id_tratamiento"));
                visita.setTratamiento(t);
                
                
                visita.setFecha(resultSet.getDate("fecha").toLocalDate());
                visita.setDetalle(resultSet.getString("detalle"));
                visita.setPeso_actual(resultSet.getDouble("peso_actual"));
                visita.setPeso_promedio(resultSet.getDouble("peso_promedio"));
               
                
            }      
            statement.close();
              
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar una visita: " + ex.getMessage());
        }
        
    return visita;
}
      

      
      public Mascota buscarMascota(int id){
    
        MascotaData m=new MascotaData(conexion);
        
        return m.buscarMascota(id);
        
        }
      public Tratamiento buscarTratamiento(int id){
    
        TratamientoData t=new TratamientoData(conexion);
        return t.buscarTratamiento(id);
    
      }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author programador
 */
public class TratamientoData {
    private Connection connection = null;
    

    public TratamientoData(Conexion conexion) {
        try {
            
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    public void guardarTratamiento(Tratamiento tratamiento){
        try {
            
            String sql = "INSERT INTO tratamiento (cod_tratamiento, tipo, descripcion, importe, activo) VALUES ( ? , ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setString(1, tratamiento.getCod_tratamiento());
            statement.setInt(2, tratamiento.getTipo());
            statement.setString(3, tratamiento.getDescripcion());
            statement.setDouble(4, tratamiento.getImporte());
            statement.setBoolean(5, tratamiento.getActivo());
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                tratamiento.setId_tratamiento(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un tratamiento");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un tratamiento: " + ex.getMessage());
        }
    }
    
    public List<Tratamiento> obtenerTratamientos(){
        List<Tratamiento> tratamientos = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM tratamiento;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Tratamiento tratamiento;
            while(resultSet.next()){
                tratamiento = new Tratamiento();
                tratamiento.setId_tratamiento(resultSet.getInt("id_tratamiento"));
                tratamiento.setCod_tratamiento(resultSet.getString("cod_tratamiento"));
                tratamiento.setTipo(resultSet.getInt("tipo"));
                tratamiento.setDescripcion(resultSet.getString("descripcion"));
                tratamiento.setImporte(resultSet.getInt("importe"));
                tratamiento.setActivo(resultSet.getBoolean("activo"));
                
                tratamientos.add(tratamiento);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los tratamientos: " + ex.getMessage());
        }
        
        
        return tratamientos;
    }
    
    public void borrarTratamiento(int id){
    try {
            
            String sql = "DELETE FROM tratamiento WHERE id_tratamiento =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
          
            statement.executeUpdate();
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al eliminar un tratamiento: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarTratamiento(Tratamiento tratamiento){
    
        try {
            
            String sql = "UPDATE tratamiento SET cod_tratamiento = ? , tipo = ? , descripcion = ? , importe = ? , activo = ? WHERE id_tratamiento = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, tratamiento.getCod_tratamiento());
            statement.setInt(2, tratamiento.getTipo());
            statement.setString(3, tratamiento.getDescripcion());
            statement.setDouble(4,tratamiento.getImporte());
            statement.setBoolean(5, tratamiento.getActivo());
            statement.setInt(6, tratamiento.getId_tratamiento());
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un tratamiento: " + ex.getMessage());
        }
    
    }
    
    public Tratamiento buscarTratamiento(int id){
    Tratamiento tratamiento=null;
    try {
            
            String sql = "SELECT * FROM tratamiento WHERE id_tratamiento =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                tratamiento = new Tratamiento();
                tratamiento.setId_tratamiento(resultSet.getInt("id_tratamiento"));
                tratamiento.setCod_tratamiento(resultSet.getString("cod_tratamiento"));
                tratamiento.setTipo(resultSet.getInt("tipo"));
                tratamiento.setDescripcion(resultSet.getString("descripcion"));
                tratamiento.setImporte(resultSet.getInt("importe"));
                tratamiento.setActivo(resultSet.getBoolean("activo"));

                
            }      
            statement.close();
            

        } catch (SQLException ex) {
            System.out.println("Error al insertar un tratamiento: " + ex.getMessage());
        }
        
        return tratamiento;
    }
    
}

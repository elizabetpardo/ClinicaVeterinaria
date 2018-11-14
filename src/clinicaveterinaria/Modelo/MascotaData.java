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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author programador
 */
public class MascotaData {
    private Connection connection = null;
    private Conexion conexion;

    public MascotaData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    public void guardarMascota(Mascota mascota){
        try {
            
            String sql = "INSERT INTO mascota (id_cliente, cod_mascota, alias, sexo, especie, raza, color_pelo, fecha_nac, peso_promedio, peso_actual) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, mascota.getCliente().getId_cliente());
            statement.setString(2, mascota.getCod_mascota());
            statement.setString(3, mascota.getAlias());
            statement.setString(4, mascota.getSexo());
            statement.setString(5, mascota.getEspecie());
            statement.setString(6, mascota.getRaza());
            statement.setString(7, mascota.getColor_pelo());
            statement.setDate(8,  Date.valueOf( mascota.getFecha_nac()));
            statement.setDouble(9, mascota.getPeso_promedio());
            statement.setDouble(10,mascota.getPeso_actual());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                mascota.setId_mascota(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una mascota");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una mascota: " + ex.getMessage());
        }
    }
    
    public List<Mascota> obtenerMascotas(){
        List<Mascota> mascotas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM mascota;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Mascota mascota;
            while(resultSet.next()){
                mascota = new Mascota(); 
                mascota.setId_mascota(resultSet.getInt("id_mascota"));
                
               Cliente x=buscarCliente(resultSet.getInt("id_cliente"));   
               mascota.setCliente(x);
                
                mascota.setCod_mascota(resultSet.getString("cod_mascota"));
                mascota.setAlias(resultSet.getString("alias"));
                mascota.setSexo(resultSet.getString("sexo"));
                mascota.setEspecie(resultSet.getString("especie"));
                mascota.setRaza(resultSet.getString("raza"));
                mascota.setColor_pelo(resultSet.getString("color_pelo"));
                mascota.setFecha_nac(resultSet.getDate("fecha_nac").toLocalDate());
                mascota.setPeso_promedio(resultSet.getDouble("peso_promedio"));
                mascota.setPeso_actual(resultSet.getDouble("peso_actual"));
                
                mascotas.add(mascota);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mascotas: " + ex.getMessage());
        }
        
        
        return mascotas;
    }
    
    public void borrarMascota(int id){
        
        
            try {
            
            String sql = "DELETE FROM visitadeatencion WHERE id_mascota = ?;";
          
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);

            statement.executeUpdate();
            
            statement.close();
            
            String sql2 = "DELETE FROM mascota WHERE id_mascota = ?;";
            
            PreparedStatement statement2 = connection.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
            statement2.setInt(1, id);
            
            statement2.executeUpdate();
            
            statement2.close();
    
            } catch (SQLException ex) {
            System.out.println("Error al insertar un mascota: " + ex.getMessage());
            }
       
             
    }
    
    public void actualizarMascota(Mascota mascota){
    
        try {
            
            String sql = "UPDATE mascota SET id_cliente = ? , cod_mascota = ? , alias = ? , sexo = ? , especie = ? , raza = ? , color_pelo = ? , fecha_nac = ? , peso_promedio = ? , peso_actual = ?  WHERE id_mascota = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, mascota.getCliente().getId_cliente());
            statement.setString(2, mascota.getCod_mascota());
            statement.setString(3, mascota.getAlias());
            statement.setString(4, mascota.getSexo());
            statement.setString(5, mascota.getEspecie());
            statement.setString(6, mascota.getRaza());
            statement.setString(7, mascota.getColor_pelo());
            statement.setDate(8, Date.valueOf(mascota.getFecha_nac()));
            statement.setDouble(9, mascota.getPeso_promedio());
            statement.setDouble(10, mascota.getPeso_actual());
            statement.setInt(11, mascota.getId_mascota());
            
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un mascota: " + ex.getMessage());
        }
    
    }
    
    public Mascota buscarMascota(int id){
    Mascota mascota=null;
    try {
            
            String sql = "SELECT * FROM mascota WHERE id_mascota =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                mascota = new Mascota();
                mascota.setId_mascota(resultSet.getInt("id_mascota"));
                
                Cliente x=buscarCliente(resultSet.getInt("id_cliente"));   
                mascota.setCliente(x);
                
                mascota.setCod_mascota(resultSet.getString("cod_mascota"));
                mascota.setAlias(resultSet.getString("alias"));
                mascota.setSexo(resultSet.getString("sexo"));
                mascota.setEspecie(resultSet.getString("especie"));
                mascota.setRaza(resultSet.getString("raza"));
                mascota.setColor_pelo(resultSet.getString("color_pelo"));
                mascota.setFecha_nac(resultSet.getDate("fecha_nac").toLocalDate());
                mascota.setPeso_promedio(resultSet.getDouble("peso_promedio"));
                mascota.setPeso_actual(resultSet.getDouble("peso_actual"));

                
            }      
            statement.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una mascota: " + ex.getMessage());
        }
        
        return mascota;
    }
    
    public Cliente buscarCliente(int id){
    
        ClienteData cd=new ClienteData(conexion);
        
        return cd.buscarCliente(id);  
    }    
    
    public List<Mascota> MascotasPorCliente(int id_cliente){
        List<Mascota> mascotas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM mascota WHERE id_cliente= ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id_cliente);
            
            ResultSet resultSet = statement.executeQuery();
            Mascota mascota;
            while(resultSet.next()){
                mascota = new Mascota(); 
                mascota.setId_mascota(resultSet.getInt("id_mascota"));
                
                Cliente x=buscarCliente(id_cliente);    
                mascota.setCliente(x);
                
                mascota.setCod_mascota(resultSet.getString("cod_mascota"));
                mascota.setAlias(resultSet.getString("alias"));
                mascota.setSexo(resultSet.getString("sexo"));
                mascota.setEspecie(resultSet.getString("especie"));
                mascota.setRaza(resultSet.getString("raza"));
                mascota.setColor_pelo(resultSet.getString("color_pelo"));
                mascota.setFecha_nac(resultSet.getDate("fecha_nac").toLocalDate());
                mascota.setPeso_promedio(resultSet.getDouble("peso_promedio"));
                mascota.setPeso_actual(resultSet.getDouble("peso_actual"));
                
                mascotas.add(mascota);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mascotas: " + ex.getMessage());
        }
        
        
        return mascotas;
    }
    
    public List<Mascota> MascotasPorTratamiento(int tipo){
        List<Mascota> mascotas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM mascota,tratamiento,visitadeatencion WHERE tipo= ? AND tratamiento.id_tratamiento = visitadeatencion.id_tratamiento AND mascota.id_mascota = visitadeatencion.id_mascota ORDER BY visitadeatencion.id_visita DESC limit 1;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, tipo);
            
            ResultSet resultSet = statement.executeQuery();
            Mascota mascota;
            while(resultSet.next()){
                mascota = new Mascota(); 
                mascota.setId_mascota(resultSet.getInt("id_mascota"));
                
                Cliente x=buscarCliente(resultSet.getInt("id_mascota"));    
                mascota.setCliente(x);
                
                mascota.setCod_mascota(resultSet.getString("cod_mascota"));
                mascota.setAlias(resultSet.getString("alias"));
                mascota.setSexo(resultSet.getString("sexo"));
                mascota.setEspecie(resultSet.getString("especie"));
                mascota.setRaza(resultSet.getString("raza"));
                mascota.setColor_pelo(resultSet.getString("color_pelo"));
                mascota.setFecha_nac(resultSet.getDate("fecha_nac").toLocalDate());
                mascota.setPeso_promedio(resultSet.getDouble("peso_promedio"));
                mascota.setPeso_actual(resultSet.getDouble("peso_actual"));
                
                mascotas.add(mascota);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mascotas: " + ex.getMessage());
        }
        
        
        return mascotas;
    }
}


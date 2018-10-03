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
 * @author usuario
 */
public class ClienteData {
    private Connection connection = null;

    public ClienteData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        }catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarCliente(Cliente cliente){
        try {
            
            String sql = "INSERT INTO cliente (dni, apellido, nombre, direccion, telefono, persona alternativa) VALUES ( ? , ? , ? , ? , ? , ?  );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, cliente.getDni());
            statement.setString(2, cliente.getApellido());
            statement.setString(3, cliente.getNombre());
            statement.setString(4, cliente.getDireccion());
            statement.setString(5, cliente.getTelefono());
            statement.setString(6, cliente.getPersona_alternativa());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            

            if (rs.next()) {
                cliente.setId_cliente(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un ciente");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
    }
    
    public List<Cliente> obtenerClientes(){
        List<Cliente> clientes = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM cliente;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                Cliente cliente;
                while(resultSet.next()){
                    cliente = new Cliente();
                    
                    cliente.setId_cliente(resultSet.getInt("id_cliente"));
                    cliente.setDni(resultSet.getInt("dni"));
                    cliente.setApellido(resultSet.getString("apellido"));
                    cliente.setNombre(resultSet.getString("nombre"));
                    cliente.setDireccion(resultSet.getString("direccion"));
                    cliente.setTelefono(resultSet.getString("telefono"));
                    cliente.setPersona_alternativa(resultSet.getString("persona alternativa"));
                    
                    clientes.add(cliente);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener los cliente: " + ex.getMessage());
        }
        
        
        return clientes;
    }
    public void borrarCliente(int id){
    try {
            
            String sql = "DELETE FROM cliente WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarCliente(Cliente cliente){
    
        try {
            
            String sql = "UPDATE alumno SET nombre = ?, fecNac = ? , activo =? WHERE id = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setInt(1, cliente.getDni());
            statement.setString(2, cliente.getApellido());
            statement.setString(3, cliente.getNombre());
            statement.setString(4, cliente.getDireccion());
            statement.setString(5, cliente.getTelefono());
            statement.setString(6, cliente.getPersona_alternativa());
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
    
    }
    
    public Cliente buscarCliente(int id){
    Cliente cliente=null;
    try {
            
            String sql = "SELECT * FROM cliente WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                cliente = new Cliente();
                
                    cliente.setId_cliente(resultSet.getInt("id_cliente"));
                    cliente.setDni(resultSet.getInt("dni"));
                    cliente.setApellido(resultSet.getString("apellido"));
                    cliente.setNombre(resultSet.getString("nombre"));
                    cliente.setDireccion(resultSet.getString("direccion"));
                    cliente.setTelefono(resultSet.getString("telefono"));
                    cliente.setPersona_alternativa(resultSet.getString("persona alternativa"));
                       
                
            }      
            statement.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
        
        return cliente;
    }
    

    
    
    
    
}

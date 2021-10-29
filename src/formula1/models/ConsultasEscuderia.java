/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formula1.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author JESCOBAR
 */
public class ConsultasEscuderia extends ModeloBD {
    
    private PreparedStatement consultaSQL;
    private ResultSet resultadoSQL;

    public ConsultasEscuderia() {
    }
    
    public boolean insertarEscuderia(Escuderia escuderia) {
        
        //almacenar la conexion de la bd
        Connection conexion = conectar();
        
        //armamos la consulta
        String query = "INSERT INTO escuderias(id,nombre,presupuesto,tipo_motor) VALUES (?,?,?,?)";
        
        //intento ejecutar la consulta BD
        try{
            //preparo la consulta en la BD
            consultaSQL=conexion.prepareStatement(query);
            
            //organizo los datos que voy a ingresar en los ?
            consultaSQL.setString(1, escuderia.getId());
            consultaSQL.setString(2, escuderia.getNombre());
            consultaSQL.setInt(3, escuderia.getPresupuesto());
            consultaSQL.setString(4, escuderia.getTipoMotor());
            
            //ejecuto la consulta preparada
            int resultado = consultaSQL.executeUpdate();
            
            //valido el resultado
            if(resultado>0){
                return true;
            }else{
                return false;
            }
                
           
        }catch(Exception error){
            
            System.out.println("upssss.. "+error);
            return false;
        }
        
    }
    
    
    
   public Escuderia buscarEscuderia(String id){
       
       //crear el objeto para instanciar clase
       Escuderia escuderia = new Escuderia();
       
       //almacenar la conexion de la bd
        Connection conexion = conectar();
        
        //armamos la consulta
        String query="SELECT * FROM escuderias WHERE id=?";
        
        //intento ejecutar la consulta BD
        try{
            //preparo la consulta en la BD
            consultaSQL=conexion.prepareStatement(query);
            
            //organizo los datos que voy a ingresar en los ?
            consultaSQL.setString(1,id);
            
            //ejecuto la consulta preparada
            resultadoSQL=consultaSQL.executeQuery();
            
            //organizamos los datos de llegada
            if(resultadoSQL.next()){
                
                escuderia.setId(resultadoSQL.getString("id"));
                escuderia.setNombre(resultadoSQL.getString("nombres"));
                escuderia.setPresupuesto(resultadoSQL.getInt("presupuesto"));
                escuderia.setTipoMotor(resultadoSQL.getString("tipo_motor"));
                return escuderia;
                
            }else{
                
                return null;
                
            }
                
           
        }catch(Exception error){
            
            System.out.println("upssss.. "+error);
            return null;
        }
        
        
       
       
       
   }
    
    
}

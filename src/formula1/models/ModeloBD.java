/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formula1.models;


import java.sql.DriverManager;
import java.sql.Connection;


/**
 *
 * @author JESCOBAR
 */
public class ModeloBD {
    
    //donde vive la BD
    private String servidorBD="jdbc:mysql://localhost/formula1";
    private String usuarioBD="root";
    private String passwordBD="";

    public ModeloBD() {
    }
    
    public Connection conectar(){
        
        Connection conexion=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(servidorBD,usuarioBD,passwordBD);
            System.out.println("Exito conectandonos");
            return conexion;
        
        }catch(Exception error){
            System.out.println("upss.. "+error);
            return null;
        }
        
    } 
    
       
}

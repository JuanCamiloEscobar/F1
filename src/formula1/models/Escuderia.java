/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formula1.models;

/**
 *
 * @author JESCOBAR
 */
public class Escuderia {
    
    private String id;
    private String nombre;
    private int Presupuesto;
    private String tipoMotor;

    public Escuderia() {
    }

    public Escuderia(String id, String nombre, int Presupuesto, String tipoMotor) {
        this.id = id;
        this.nombre = nombre;
        this.Presupuesto = Presupuesto;
        this.tipoMotor = tipoMotor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(int Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    } 
    
    
    
    
}

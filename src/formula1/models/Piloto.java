/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formula1.models;

/**
 *
 * @author JESCOBAR
 */
public class Piloto {
    
    private int id;
    private String nombres;
    private int salario;
    private String fechaInicio;
    private String fechaSalida;
    private String idEscuderia;

    public Piloto() {
    }

    public Piloto(int id, String nombres, int salario, String fechaInicio, String fechaSalida, String idEscuderia) {
        this.id = id;
        this.nombres = nombres;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
        this.fechaSalida = fechaSalida;
        this.idEscuderia = idEscuderia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getIdEscuderia() {
        return idEscuderia;
    }

    public void setIdEscuderia(String idEscuderia) {
        this.idEscuderia = idEscuderia;
    }
    
    
    
    
}

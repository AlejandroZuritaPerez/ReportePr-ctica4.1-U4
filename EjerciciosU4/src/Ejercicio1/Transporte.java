/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */

// SuperClase
public class Transporte {

    private double velocidad;
    private String nombre;
    private String matricula;
    private int año;
    
    
    //Declarando mi constructor
    public Transporte (double Velocidad, String Nombre, String Matricula, int Año){
        
        this.velocidad = Velocidad;
        this.nombre = Nombre;
        this.matricula = Matricula;
        this.año = Año;
        
    }
    //Declarando Funciones o metodos
    public double getVelocidad(){
        return this.velocidad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public int getAño(){
        return this.año;
    }
    
    
}

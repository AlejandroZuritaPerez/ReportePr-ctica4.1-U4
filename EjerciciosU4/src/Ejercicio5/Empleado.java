/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Empleado {
    
    private String nombre;

//    Constructor de la clase Empleado
    public Empleado(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor de Empleado: " +nombre);
    }
    
//Declarando métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    //Declarando un toString  que devuelve un String formado por la palabra “Empleado” y el nombre de empleado 
    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Estudiante extends Persona {
    
//    declarando atributos propios de la clase Estudiante
    private int nControl;
    private float promFinal;

//    constructor de la clase Estudiante
    public Estudiante(String nombre, String apellidos, int edad, int nControl, float promFinal) {
        super(nombre, apellidos, edad);
        this.nControl = nControl;
        this.promFinal = promFinal;
    }

    public String MostrarMensaje(){
        return "Nombre del Estudiante: " +getNombre() +
                "\nApellido del Estudiante: " +getApellidos() +
                "\nEdad del Estudiante: " +getEdad() + " anios" +
                "\nNum. de Control: " +nControl +
                "\nCalificacion Final: " +promFinal;
    }
    
    
    
}

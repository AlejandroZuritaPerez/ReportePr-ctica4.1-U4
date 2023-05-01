/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Barco extends Transporte {

    public Barco(double Velocidad, String Nombre, String Matricula, int Año) {
        super(Velocidad, Nombre, Matricula, Año);
    }

    
    
    //metodos o funciones
    public String Mostrar(){
        return "Nombre del Barco: " +getNombre() +
                "\nAno del Barco: " +getAño() +
                "\nVelocidad Maxima: " +getVelocidad() + "km" +
                "\nMatricula del Barco: " +getMatricula();
    }
    
}

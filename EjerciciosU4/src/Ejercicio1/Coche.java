/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Coche extends Transporte {

    public Coche(double Velocidad, String Nombre, String Matricula, int Año) {
        super(Velocidad, Nombre, Matricula, Año);
    }


    //metodos o funciones
    public String Mostrar(){
        return "Nombre del Coche: " +getNombre() +
                "\nAno del Coche: " +getAño() +
                "\nVelocidad Maxima: " +getVelocidad() + "km" +
                "\nMatricula del Coche: " +getMatricula();
    }

    
}

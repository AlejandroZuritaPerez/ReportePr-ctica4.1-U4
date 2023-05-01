/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Principal {
    
    public static void main(String[] args) {
        //Barco(double Velocidad, String Nombre, String Matricula, int Año) 
        Barco b1 = new Barco(180, "BOMBARD", "YHJ4569", 2008);
        Coche c1 = new Coche(240, "Ford Fusion", "YJG4655", 2010);
        
        System.out.println("<><><><><><><><><><><><><><><><><><><>");
        System.out.println(b1.Mostrar());
        System.out.println("<><><><><><><><><><><><><><><><><><><>");
        System.out.println(c1.Mostrar());
        System.out.println("<><><><><><><><><><><><><><><><><><><>");
        
    }
}

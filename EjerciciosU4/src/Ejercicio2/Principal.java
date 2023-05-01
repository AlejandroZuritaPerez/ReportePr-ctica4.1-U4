/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;


/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Estudiante e1 = new Estudiante("Fernando","Rojas Hernandez",24,2260203,86.4f);
        Estudiante e2 = new Estudiante("Carlos","Flores Vazquez",20,2260103,75.6f);
        Estudiante e3 = new Estudiante("Karla","Garcia Hernandez",25,22600406,99.9f);
        
        System.out.println("<><><><><><><><><><><><><><>");
        System.out.println(e1.MostrarMensaje());
        System.out.println("<><><><><><><><><><><><><><>");
        System.out.println(e2.MostrarMensaje());
        System.out.println("<><><><><><><><><><><><><><>");
        System.out.println(e3.MostrarMensaje());
        System.out.println("<><><><><><><><><><><><><><>");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Principal {
    
    public static void main(String[] args) {
        String nombre, telefono, direccion;
        int sueldo, edad;
        
        nombre = JOptionPane.showInputDialog(null, "Ingresa el Nombre del Empleado: ", "SOLICITANDO DATOS", 3);
        edad = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa la edad del Empleado: ", "SOLICITANDO DATOS", 3));
        sueldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el sueldo del Empleado: ", "SOLICITANDO DATOS", 3));
        telefono = JOptionPane.showInputDialog(null, "Ingresa el telefono del Empleado: ", "SOLICITANDO DATOS", 3);
        direccion = JOptionPane.showInputDialog(null, "Ingresa la direccion del Empleado: ", "SOLICITANDO DATOS", 3);

        Empleado em1 = new Empleado(nombre, edad, sueldo, telefono, direccion);
        em1.verDatos();
        
        nombre = JOptionPane.showInputDialog(null, "Ingresa el Nombre del Empleado: ", "SOLICITANDO DATOS", 3);
        edad = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa la edad del Empleado: ", "SOLICITANDO DATOS", 3));
        sueldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el sueldo del Empleado: ", "SOLICITANDO DATOS", 3));
        telefono = JOptionPane.showInputDialog(null, "Ingresa el telefono del Empleado: ", "SOLICITANDO DATOS", 3);
        direccion = JOptionPane.showInputDialog(null, "Ingresa la direccion del Empleado: ", "SOLICITANDO DATOS", 3);

        
        Empleado em2 = new Empleado(nombre, edad, sueldo, telefono, direccion);
        em2.verDatos();
        
        
    }
    
}

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
public class Empleado extends Persona{
    
    private int sueldo;
    private String telefono;
    private String direccion;

    public Empleado(String nombre, int edad, int sueldo, String telefono, String direccion) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.telefono = telefono;
        this.direccion = direccion; 
    }
    @Override
    public void verDatos(){
        JOptionPane.showMessageDialog(null, "Nombre del Empleado: " +getNombre() +
                "\nEdad del Empleado: " +getEdad() +
                "\nSueldo del Empleado: " +sueldo +
                "\nTelefono del Empleado: " +telefono +
                "\nDirección del empleado: Calle: " +direccion, "DATOS DEL EMPLEADO",JOptionPane.INFORMATION_MESSAGE);
    }
}

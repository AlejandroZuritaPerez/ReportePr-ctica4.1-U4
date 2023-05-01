/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Principal {
    
    public static void main(String[] args) {
        String tipo, marca, color, matricula, velocidades;
        int modelo;
        
        tipo = JOptionPane.showInputDialog(null, "Ingresa el Tipo de Carro: ", "DATOS DE CARROS", 3);
        marca = JOptionPane.showInputDialog(null, "Ingresa la Marca del Carro: ", "DATOS DE CARROS", 3);
        color = JOptionPane.showInputDialog(null, "Ingresa el Color del Carro: ", "DATOS DE CARROS", 3);
        modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Modelo del Carro: ", "DATOS DE CARROS", 3));
        matricula = JOptionPane.showInputDialog(null, "Ingresa la Matricula del Carro: ", "DATOS DE CARROS", 3);
        
        Carros car1 = new Carros(tipo, marca, color, 0, matricula);
        car1.Mostrar();
        
        tipo = JOptionPane.showInputDialog(null, "Ingresa el Tipo de Motocicleta: ", "DATOS DE LA MOTOCICLETA", 3);
        marca = JOptionPane.showInputDialog(null, "Ingresa la Marca de la Motocicleta: ", "DATOS DE LA MOTOCICLETA", 3);
        color = JOptionPane.showInputDialog(null, "Ingresa el Color de la Motocicleta: ", "DATOS DE LA MOTOCICLETA", 3);
        modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Modelo de la Motocicleta: ", "DATOS DE LA MOTOCICLETA", 3));
        velocidades = JOptionPane.showInputDialog(null, "Ingresa la Potencia de la Motocicleta: ", "DATOS DE LA MOTOCICLETA", 3);
        
        Motocicleta moto1 = new Motocicleta(tipo, marca, color, modelo, velocidades);
        moto1.Mostrar();

        
    }
    
}

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
public class Motocicleta extends Vehiculo{
    
    private String velocidades;

    public String getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(String velocidades) {
        this.velocidades = velocidades;
    }
    
    public Motocicleta(String tipo, String marca, String color, int modelo, String velocidades) {
        super(tipo, marca, color, modelo);
        this.velocidades = velocidades;
    }
    
    public void Mostrar(){
        JOptionPane.showMessageDialog(null, "Tipo de Carro: " +getTipo() +
                "\nMarca: " +getMarca() +
                "\nColor: " +getColor() +
                "\nModelo: " +getModelo() +
                "\nPotencia: " +velocidades + " CC", "INFORMACION DE MOTOCICLETAS", JOptionPane.INFORMATION_MESSAGE);
    
    }
}

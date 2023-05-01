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
public class Carros extends Vehiculo{
    
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public Carros(String tipo, String marca, String color, int modelo, String matricula) {
        super(tipo, marca, color, modelo);
        this.matricula = matricula;
    }
    
    public void Mostrar(){
        JOptionPane.showMessageDialog(null, "Tipo de Carro: " +getTipo() +
                "\nMarca: " +getMarca() +
                "\nColor: " +getColor() +
                "\nModelo: " +getModelo() +
                "\nMatricula: " +matricula, "INFORMACION DE CARROS", JOptionPane.INFORMATION_MESSAGE);
    }
    
}

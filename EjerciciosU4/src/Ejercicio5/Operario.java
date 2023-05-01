/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Operario extends Empleado{
    
//    Constructor con un parametro
    public Operario(String nombre) {
        super(nombre);
        System.out.println("Constructor de Operario");
    }

//    modificación del método toString() para mostrar el mensaje adecuado                                         
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
    
}

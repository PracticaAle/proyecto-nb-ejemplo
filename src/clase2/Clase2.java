/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int edad = 20;
        String nombre = "Pepito";
        double salario = 0.0;
        int loteria = 0;
        String comodin;

        String imprimir = nombre + "\n" + "Edad: " + edad;

        JOptionPane.showMessageDialog(null, imprimir);
        comodin = JOptionPane.showInputDialog("Digite el numero ganadro de la loteria: ");
        loteria = Integer.parseInt(comodin);
        loteria = +10;

        JOptionPane.showMessageDialog(null, loteria);
    
    }
    
}

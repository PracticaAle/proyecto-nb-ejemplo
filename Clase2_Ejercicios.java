/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2_ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Clase2_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//       //ARROLLEMOS • Escriba un programa queLOle solicite SIGUIENTE: al usuario el número de día y le indique el
//nombre del día.
//• Por ejemplo 1 = Domingo, 2 = Lunes, 3 = Martes, 4 = Miércoles, 5 = Jueves, 6 =
//Viernes, 7 =
//• Sábado.
//• Modifique el programa para que muestre cuáles días son laborales y cuales son
//libres.
//• A pesar de que esto está en función de horarios muy variados, considere que de
//Lunes a
//• Viernes es laborable y los sábados y domingos son libres.
//• Escriba un programa que le solicite al usuario 4 números y le muestre cuál es el
//mayor.

        
        String Val = "";
        int valin = 0;
        String val = JOptionPane.showInputDialog("Digite el numero dia de la semana: ");
        System.out.println(val);
        valin = Integer.parseInt(val);
        System.out.println(valin);
        switch (valin) {
            case 1:
                JOptionPane.showMessageDialog(null, "Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No aplica");

        }
        
//Ejercicio 1
        
//         Desarrolle un ejercicio que le solicite al usuario los
//años de antigüedad, la cantidad de horas
//laboradas por semana y el precio que se le paga por
//hora, con estos datos debe calcular el salario bruto.
//• Si el usuario tiene más de 12 años de trabajar para la
//empresa, se le dará un bono del 5.5% de su salario
//bruto, si este nuevo salario bruto es superior a
//$2500 debe hacerse una deducción del 2.7%, pero si
//el salario supera los $3500, esta deducción será del
//3.8%. Muestre al usuario el salario neto final.
        

//Ejercicio 2

//        double sal;
//
//        int años = Integer.parseInt(JOptionPane.showInputDialog("Digite los años laborados: "));
//        int cantH = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de horas que labura: "));
//        int prePH = Integer.parseInt(JOptionPane.showInputDialog("Cuanto pago recibe por hora laborada: "));
//
//        sal = cantH * prePH;
//        JOptionPane.showMessageDialog(null, sal);
//        
//        if (años>12) { 
//            sal= sal+(sal*(5.5/100));} 
//        
//        if (sal>2500 && sal>=3500){
//            sal=sal-(sal*(2.7/100));}
//        
//        if (sal>3500){
//            sal= sal+(sal*(3.8/100));}
//        
//        JOptionPane.showMessageDialog(null, "Su salario final es: "+sal);
//        
        
  
// Ejercicio 3


        }
        }
    

        
        
    
    


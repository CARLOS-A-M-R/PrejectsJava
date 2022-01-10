/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author yoshy
 */
public class Currency {
    
    private int amount;
    private double valuePesos;
    private double valueDollar;
    private double result;
    private static final double  DOLARPESO = 20.39;
    private static final double EUROPESO = 23.10;

   DecimalFormat format1 = new DecimalFormat("###.##");

      
    
    public void data() {
       int data1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa cantidad en pesos "));
       int data2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa cantidad en dolares "));
       int data3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa cantidad en euros "));
       double res = (data1 * 1.0)/DOLARPESO;
       double res2 = (data2 * DOLARPESO)/1.0;
       double res3 = (data1 * 1.0)/EUROPESO;
       double res4 = (data3* EUROPESO)/1.0;
       JOptionPane.showMessageDialog(null, "El resultado de " +data1+" pesos a dolares es: "+ format1.format(res) + 
                                           "\nEl resultado de " +data2+" dolares a pesos es: "+ format1.format(res2) + 
                                           "\nEl resultado de " +data1+ " pesos a euros es: "+ format1.format(res3) +
                                           "\nEl resultado de " +data3+ " euros a pesos es: "+  format1.format(res4));
    }
    
}

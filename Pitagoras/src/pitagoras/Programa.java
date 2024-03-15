/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pitagoras;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Matematica math = new Matematica();
        
        System.out.println("Teorema de Pitágoras");
        System.out.print("b:");
        double b = leitura.nextDouble();
        System.out.print("c:");
        double c = leitura.nextDouble();
        
        System.out.println("A hipotenusa vale " + math.Pitagoras(b, c));
    }
}

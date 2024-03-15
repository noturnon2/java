/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import LeonardoPisa.Fibonacci;
import java.util.Scanner;

/**
 *
 * @author anderson0563
 */
public class Calculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        Scanner leitura = new Scanner(System.in);
        
        System.out.println(f.recursivo(leitura.nextInt()));
        System.out.println(f.iterativo(leitura.nextInt()));
    }
}

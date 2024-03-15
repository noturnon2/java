/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parouimpar;

import java.util.Scanner;

/**
 *
 * @author anderson0563
 */
public class ParOuImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leitura = new Scanner(System.in);
       TestaParidade test = new TestaParidade();
       
       System.out.println(test.calcula(leitura.nextInt())?"É Par":"É Ímpar");
    }
}

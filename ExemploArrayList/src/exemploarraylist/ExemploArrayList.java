/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author
 */
public class ExemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        Scanner leitura = new Scanner(System.in);
        System.out.println("n:");
        int n=leitura.nextInt();
        for(int i=0; i<=n; i++)
            lista.add(new Integer((new Fatorial(i)).calcula()));
        int j=0;
        for(Integer i: lista)
        {
            System.out.println(j++ + ":" + i.intValue());
        }
        
        
        
    }
}

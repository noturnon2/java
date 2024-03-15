/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LeonardoPisa;

/**
 *
 * @author anderson0563
 */
public class Fibonacci {

    public int recursivo(int n) {
        int F = 0;
        if (n == 0) {
            F = 0;
        }
        if (n == 1) {
            F = 1;
        }
        if (n >= 2) {
            F = recursivo(n - 1) + recursivo(n - 2);
        }

        return F;
    }

    public int iterativo(int n) {
        int Fverm = n, Faz, Fpr;
        Faz = 0;
        Fpr = 1;
        for (int i = 2; i <= n; i++) {
            Fverm = Faz + Fpr;
            Faz = Fpr;
            Fpr = Fverm;
        }
        return Fverm;
    }
}

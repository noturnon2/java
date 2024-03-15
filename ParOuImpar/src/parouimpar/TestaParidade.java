/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parouimpar;

/**
 *
 * @author */
public class TestaParidade {
    public boolean calcula(int n)
    {
        boolean EhPar = true;
        
        if(n%2!=0)
            EhPar = false;
        
        return EhPar;
                  
    }
}

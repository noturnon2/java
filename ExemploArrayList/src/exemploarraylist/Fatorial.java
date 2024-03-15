/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

/**
 *
 * @author 
 */
public class Fatorial {
    private int n;

    public Fatorial(int n)
    {
        this.n=n;
    }
    
    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        if(n<0) n=0;
        this.n = n;
    }
    
    private int fatorial(int n)
    {
        int f=1;
        if(n>1) f = n * fatorial(n-1);
        return f;
    }
    
    public int calcula()
    {
        return this.fatorial(n);
    }
    
}
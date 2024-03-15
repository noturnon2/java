package nucleo;

public class fatorial1 {
	private int n;
	public int getN()
	{
		return n;
	}
	public void setN(int n)
	{
		this.n=(n>0)?n:0;
	}
	public fatorial1(int n)
	{
		this.setN(n);
	}
	private int fatorial(int n)
	{
		//n>=1 -> n!=n.(n-1)!  recorrencia
		if(n>=1) return n*fatorial(n-1);
		//n=0  -> n!=1
		return 1;
	}
	public String toString()
	{
		return "O fatorial de " + n + " vale " + fatorial(n);
	}
	
}

package nucleo;

public class padraozinho {
	private int n;
	protected String contaTexto;
	public int getN()
	{
		return n;
	}
	public void setN(int n)
	{
		this.n=(n>0)?n:0;
	}
	public void setContaTexto(String contaTexto)
	{
		this.contaTexto = contaTexto;
	}
	public padraozinho(int n, String contaTexto)
	{
		this.setN(n);
		this.setContaTexto(contaTexto);
	}
	/*public String toString()
	{
		return "O "+contaTexto+" de " + n + " vale " + conta(n);
	}*/
}

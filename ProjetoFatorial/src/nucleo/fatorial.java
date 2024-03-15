package nucleo;

public class fatorial extends padraozinho implements conta{
	
	public fatorial(int n) {
		super(n, "fatorial");
		// TODO Auto-generated constructor stub
	}

	//@Override
	public int conta(int n) {
		//n>=1 -> n!=n.(n-1)!  recorrencia
		if(n>=1) return n*conta(n-1);
		//n=0  -> n!=1
		return 1;
	}
	
	protected int conta()
	{
		int fat=1;
		for(int i=1; i<=super.getN(); i++)
			fat*=i;
		return fat;
	}
	
	public String toString()
	{
		return "fat=" + conta();
	}

	@Override
	public int imprimir(padraozinho p, int n) {
		// TODO Auto-generated method stub
		return conta();
	}

}

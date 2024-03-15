package nucleo;

public class soma extends padraozinho implements conta{

	public soma(int n) {
		super(n, "soma");
		// TODO Auto-generated constructor stub
	}
	
	public int conta(int n)
	{
		return n + n;
	}

	@Override
	public int imprimir(padraozinho p, int n) {
		// TODO Auto-generated method stub
		return conta(n);
	}

}

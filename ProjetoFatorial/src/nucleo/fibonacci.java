package nucleo;

public class fibonacci extends padraozinho implements conta{

	public fibonacci(int n) {
		super(n, "fibonacci");
		// TODO Auto-generated constructor stub
	}

	//@Override
	public int conta(int n) {
		if(n>=2) return conta(n-1) + conta(n-2);
		return n;
	}

	@Override
	public int imprimir(padraozinho p, int n) {
		// TODO Auto-generated method stub
		return conta(n);
	}

}

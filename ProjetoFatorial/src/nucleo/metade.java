package nucleo;

public class metade   extends padraozinho implements conta{

	public metade(int n) {
		super(n, "metade");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int conta(int n) {
		// TODO Auto-generated method stub
		return n/2;
	}

	@Override
	public int imprimir(padraozinho p, int n) {
		// TODO Auto-generated method stub
		return conta(n);
	}

}

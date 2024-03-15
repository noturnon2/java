package nucleo;

public class triplo  extends padraozinho implements conta{

	public triplo(int n) {
		super(n, "triplo");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int conta(int n) {
		// TODO Auto-generated method stub
		return 3*n;
	}

	@Override
	public int imprimir(padraozinho p, int n) {
		// TODO Auto-generated method stub
		return conta(n);
	}

}

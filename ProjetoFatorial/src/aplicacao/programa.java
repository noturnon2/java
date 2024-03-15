package aplicacao;

import java.util.Scanner;

import nucleo.fatorial;
import nucleo.fatorial1;
import nucleo.fibonacci;
import nucleo.metade;
import nucleo.padraozinho;
import nucleo.soma;
import nucleo.triplo;

public class programa {

	/*public int imprimir(padraozinho p, int n)
	{
		return p.conta(n);
	}*/
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.print("Entre com n:");
		int n = leitura.nextInt();
		
		fatorial Fat = new fatorial(n);
		System.out.println(Fat.imprimir(Fat, Fat.getN()));
		fibonacci Fib = new fibonacci(n);
		System.out.println(Fib.imprimir(Fib, Fib.getN()));
		soma S = new soma(n);
		System.out.println(S.imprimir(S, S.getN()));
		triplo T = new triplo(n);
		System.out.println(T.imprimir(T, T.getN()));
		metade M = new metade(n);
		System.out.println(M.imprimir(M, M.getN()));
	}

}

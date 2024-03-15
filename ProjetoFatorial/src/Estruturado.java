import java.util.Scanner;


public class Estruturado {
	public static int fatorial(int n)
	{
		//n>=1 -> n!=n.(n-1)!  recorrencia
		if(n>=1) return n*fatorial(n-1);
		//n=0  -> n!=1
		return 1;
	}
	/*public static void main(String[] args) {
		int n;
		System.out.printf("valor de n:");
		n=(new Scanner(System.in)).nextInt();
		n=(n>0)?n:0;	
		System.out.printf("O fatorial de %d vale %d", n, fatorial(n));
	}*/

}

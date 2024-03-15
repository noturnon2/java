import java.util.Scanner;


public class programa {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Entre com a palavra");
		
		palindrome palavra = new palindrome(leitura.nextLine());
		
		System.out.println(palavra);
	}

}

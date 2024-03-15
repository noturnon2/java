package CriarArquivo;

/**
 *
 * @authors Bruno Aloise, Marcília Cezar, Luiz Cardineli e Flavio Sabino 
 */

import java.io.IOException;
import java.util.Scanner;
import jxl.write.WriteException;

public class Principal {

    public static void main(String[] args) throws IOException, WriteException {

        Scanner entrada = new Scanner(System.in);

        ModificarTabela Tabela = new ModificarTabela();
        /**
         * Definindo um objeto (Tabela) para utilização dos metodos criados em
         * ModificarTabela.java
         */
        System.out.println("Indique o local onde a planilha a ser alterada"
                + "se encontra");
        Tabela.iniciar(); //Invocando o método para selecionar o arquivo  

        System.out.println("Digite um nome para o arquivo de saída: ");
        String nomeArquivo = entrada.nextLine();
        //Nome que terá a planilha do usuário
        System.out.println("Digite o nome do seu time");
        String time = entrada.nextLine();
        
        System.out.println("Digite o item a ser modificado "
                + "\nJ = Jogos -- V = Vitoria -- P = Pontos -- "
                + "\nE = Empates -- D = Derrotas -- GP = Gols Pro -- "
                + "\nGC = Gols Contra -- SG = Saldo de Gols");
        String item = entrada.nextLine().toUpperCase();
        
        System.out.println("Digite o valor a ser alterado");
        int num = entrada.nextInt();

        Tabela.CriarTabela(nomeArquivo, time, item, num);
        /**
         * Método que cria uma cópia da planilha original, com o nome dado pelo
         * usuário, e altera o valor do item escolhido também pelo usuário.
         */
        Tabela.finalizar();
        //Fechando a planilha
        //Fim do Programa    
    }
}

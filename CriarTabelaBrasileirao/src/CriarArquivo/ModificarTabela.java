package CriarArquivo;

/**
 *
 * @authors Bruno Aloise, Marcília Cezar, Luiz Cardineli e Flavio Sabino 
 */

import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

import jxl.*;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.Number;
import jxl.write.WritableCell;
import jxl.write.biff.RowsExceededException;

public class ModificarTabela {

    //private Workbook wb;
    public Workbook wb;
    public WritableWorkbook workbook;
    public WritableSheet st2;

    public void iniciar() throws IOException, WriteException {

        try {

            JFileChooser fopen = new JFileChooser();
            fopen.showOpenDialog(fopen);
            /**
             * Carrega a planilha abrindo um caixa de diálogo para escolha do
             * arquivo em qualquer lugar do sistema de arquivos
             */
            wb = Workbook.getWorkbook(fopen.getSelectedFile());

            //Atribui o arquivo escolhido a (wb) na forma de pasta de trabalho(Workbook)   

        } catch (HeadlessException | IOException | BiffException e) {
        }
    }

    /**
     *
     * @throws IOException
     */
    public void CriarTabela(String NomeArquivo, String Time, String Item, int num) throws IOException, WriteException {

        try {

            workbook = Workbook.createWorkbook(new File(NomeArquivo + ".xls"), wb);
            // Cria uma copia da pasta de trabalho (wb) com o nome do arquivo determinado pelo usuário

        } catch (IOException ex) {
            Logger.getLogger(ModificarTabela.class.getName()).log(Level.SEVERE, null, ex);
        }

        st2 = workbook.getSheet(0); // Determina a aba que vou utilizar       
        int Lin = st2.getRows();
        int Col = st2.getColumns();
        //Utilizado para obter o tamanho das linhas e colunas da planilha

        WritableCell[][] resultado = new WritableCell[Col][Lin];
        //Criado uma celula resultado para uso posterior

        for (int i = 0; i < Lin; i++) {

            resultado[1][i] = st2.getWritableCell(1, i);
            /**
             * Aqui é atribuido os valores, na posição indicada pela variavel
             * (i), contidos na aba (st2) a resultado. O sistema não estava
             * aceitando a comparação direta por isso esse procedimento teve que
             * ser feito
             */
            if (Time.equals(resultado[1][i].getContents())) {
                // Aqui é comparado a variável Time com os valores obtidos em resultado.
                do {
                    insereValor(st2, Item, num, i); //Invocando o método para inserção

                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Digite o item a ser modificado "
                            + "\nJ = Jogos -- V = Vitoria -- P = Pontos -- "
                            + "\nE = Empates -- D = Derrotas -- GP = Gols Pro -- "
                            + "\nGC = Gols Contra -- SG = Saldo de Gols "
                            + "\nOu digite \"S\"para Sair");
                    Item = entrada.nextLine().toUpperCase();
                    System.out.println("Digite o valor a ser alterado");
                    num = entrada.nextInt();

                } while (!"S".equals(Item));
                //Repetição para alterar multiplos itens.
            }
        }
    }

    public String insereValor(WritableSheet st2, String Item, int num, int i)
            throws WriteException {
        //Método para inserir valor na planilha                    

        switch (Item) {
            //Aqui foi usado um switch para escolha do item a ser alterado

            case "P":
                addNumero(st2, 2, i, num);
                //Invocando o método addNumero para adicionar o valor a planilha
                break;

            case "J":
                addNumero(st2, 3, i, num);
                break;

            case "V":
                addNumero(st2, 4, i, num);
                break;

            case "E":
                addNumero(st2, 5, i, num);
                break;

            case "D":
                addNumero(st2, 6, i, num);
                break;

            case "GP":
                addNumero(st2, 7, i, num);
                break;

            case "GC":
                addNumero(st2, 8, i, num);
                break;

            case "SG":
                addNumero(st2, 9, i, num);
                break;

            default:
                System.out.println("Você não selecionou uma opção válida");
        }
        return Item; //Retorno do método
    }
    /**
     *
     * @param planilha
     * @param coluna
     * @param linha
     * @param integer
     * @param times
     * @throws WriteException
     * @throws RowsExceededException
     */
    public void addNumero(WritableSheet planilha, int coluna, int linha, int integer)
            throws WriteException, RowsExceededException {
        //Este é o método responável pela alteração do valor na planilha
        Number numero;
        numero = new Number(coluna, linha, integer);
        planilha.addCell(numero);
    }

    public void finalizar()
            throws IOException, WriteException {
        wb.close();
        workbook.write();
        workbook.close();
    }
    //Método para fechar os arquivos
}

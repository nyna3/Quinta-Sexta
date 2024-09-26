package EstruturaSequencialMark;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        //criar um scanner para receber o valor da diagonal maior e menor
        Scanner scanner = new Scanner (System.in);

        //Pedir para o usuário inserir o valor da primeira diagonal
        System.out.print("Insira o valor da diagonal maior: ");
        Double diagonalmaior = scanner.nextDouble();

        //Pedir para o usuário inserir o valor da seugunda diagonal
        System.out.print("Insira o valor da diagonal menor: ");
        Double diagonalmenor = scanner.nextDouble();

        //Calcular a área do losango
        Double areadolosango = (diagonalmaior * diagonalmenor)/2;

        //Exibir o resultado
        System.out.println("A área do losnago é: " + areadolosango);

        //Fechamento
        scanner.close();

    }

}
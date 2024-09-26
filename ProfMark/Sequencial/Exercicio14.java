package EstruturaSequencialMark;
import java.util.Scanner;

public class Exercicio14{

    public static void main(String[] args) {
        
        //Criar scanner para receber duas variáveis
        Scanner scanner = new Scanner(System.in);

        //Pedir ao usuário para inserir duas variáveis
        System.out.print("Insira a primeira variável: ");
        Double v1 = scanner.nextDouble();

        System.out.print("Insira a segunda variável: ");
        Double v2 = scanner.nextDouble();

        //inverter as variáveis
        Double v12 = v2;
        Double v21 = v1;
        
        //Exibir os resultados
        System.out.println("Você inseriu as variáveis: " + v1 + ", " + v2);

        System.out.println("Depois da troca ficou assim:");


        System.out.println("Primeira variável: " + v12);

        System.out.println("Segunda variável: " + v21);

        //Fechamento
        scanner.close();
    }
}
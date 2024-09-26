package EstruturaSequencialMark;
import java.util.Scanner;

public class Exercicio11{

    public static void main(String[] args) {
        
        //Criar scanner para receber um número inteiro
        Scanner scanner = new Scanner(System.in);

        //Pedir ao usuário para inserir um número inteiro
        System.out.print("Digite um número inteiro:");
        Double ni = scanner.nextDouble();

        //Calculos
        Double nantecessor = ni - 1;

        Double nsucessor = ni + 1;

        Double ndobro = ni * 2;

        Double nmetade = ni / 2;

        //Exibir resultado
        System.out.println("O antecessor do número " + ni + " é: " + nantecessor);

        System.out.println("O sucessor do número " + ni + " é: " + nsucessor);

        System.out.println("O dobro do número " + ni + " é: " + ndobro);

        System.out.println("A metade do número " + ni + " é: " + nmetade);

        //Fechamento
        scanner.close();
    }
}
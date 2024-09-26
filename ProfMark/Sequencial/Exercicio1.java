package EstruturaSequencialMark;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //criar um objeto scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner (System.in);

        //pedir ao usuário para inserir tres números inteiros
        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = scanner.nextInt();

        //Calcular a média aritimética
        double media = (n1 + n2 + n3) / 3.0;

        //Exibir o resultado
        System.out.println("Você digitou os números:" + n1 + "," +n2 + "," + n3);
        System.out.println("A Média Aritimética deles é: " + media);

        //Fechar o scanner
        scanner.close();
    }
}
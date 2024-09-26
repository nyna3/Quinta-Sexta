package EstruturaSequencialWesley;
import java.util.Scanner;
public class Pratica1{

    public static void main(String[] args) {
        
        //Criar scanner para receber três notas e apresentar sua média aritmética
        Scanner scanner = new Scanner(System.in);

        //Pedir ao usuário para inserir as três notas
        System.out.println("Insira três notas para a exibição de sua média aritimética.");
        System.out.println("Insira a primeira nota: ");
        Double nota1 = scanner.nextDouble();

        System.out.println("Insira a segunda nota: ");
        Double nota2 = scanner.nextDouble();

        System.out.println("Insira a terceira nota: ");
        Double nota3 = scanner.nextDouble();

        //Calcular a média aritimética
        Double media = (nota1 + nota2 + nota3) / 3.0;

        //Exibir resultados
        System.out.println("A média aritimética das três notas inseridas é: " + media);

        //Fechar
        scanner.close();
    }
}
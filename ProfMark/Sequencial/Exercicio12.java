package EstruturaSequencialMark;
import java.util.Scanner;

public class Exercicio12{

    public static void main(String[] args) {

        //Criar um scanner para receber a altura do usuário
        Scanner scanner = new Scanner(System.in);

        //Pedir ao usuário para inserir a altura
        System.out.println("Você é homem e gostaria de saber seu peso ideal? ");
        System.out.println(" ");
        System.out.print("Por favor, insira a sua altura(m):");
        Double altura = scanner.nextDouble();
        System.out.println(" ");

        //Calcular o peso ideal do usuário
        Double pesoi = (altura * 72.7) - 58;

        //Exibir resultado
        System.out.println("O seu peso ideal é: " + pesoi);

        //Fechamento
        scanner.close();
    }
}
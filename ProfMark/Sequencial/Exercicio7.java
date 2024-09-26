package EstruturaSequencialMark;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        //Criar um scanner para receber o valor do salário mínimo
        Scanner scanner = new Scanner(System.in);

        //Solicitar ao usuário o valor do salário minimo atual
        System.out.print("Favor inserir o valor atual do salário mínimo: ");
        Double sminimo = scanner.nextDouble();

        //Solicitar ao usuário o valor de seu salário
        System.out.print("Determine o valor do seu salário: ");
        Double susuario = scanner.nextDouble();
        
        //Calcular quantos salários mínimos o usuário recebe
        Double smrecebe = (susuario / sminimo);

        //Exibir a quantidade de salarios o usuário recebe
        System.out.print("Você recebe um total de " + smrecebe + " salários mínimos. ");

        //Fechamento
        scanner.close();

    }
}
package EstruturaSequencialMark;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        //Criar scanner para receber o valor gasto no restaurante pelo usuário
        Scanner scanner = new Scanner(System.in);

        //Pedir ao usuário o seu valor gasto no restaurante
        System.out.println("Quer saber quanto deverá pagar ao garçom?");
        System.out.println("");

        //Valor gasto no restaurante
        System.out.print("Insira quanto você gastou no restaurante? R$");
        Double vrestaourante = scanner.nextDouble();

        //Calcular o valor a ser pago ao garçom
        Double garçom = vrestaourante * 0.10;

        //Exibir resultado
        System.out.println("Você gastou um total de R$" + vrestaourante + " no restaurante.");
        System.out.println("Deverá pagar ao garçom: R$" + garçom);

        //Fechamento
        scanner.close();

    }
}
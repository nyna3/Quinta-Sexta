package EstruturaSequencialWesley;

import java.util.Scanner;
public class Pratica4{
    public static void main(String[] args) {
        
        //Criar scanner para receber o salário do usuário
        Scanner scanner = new Scanner(System.in);

        //Introdução
        System.out.println("O seu salário aumentou 25%!!! Quer saber quanto você passará a ganhar?");
        System.out.println("");

        //Pedir ao usuário para inserir o valor de seu salário
        System.out.println("Insira o valor do seu salário: ");
        Double salario = scanner.nextDouble();

        //Calculo
        Double Aumento = (salario * 0.25) + salario;

        //Exibir resultados
        System.out.println("Seu salário atual é: R$" + Aumento);

        //Fechar
        scanner.close();
    }
}
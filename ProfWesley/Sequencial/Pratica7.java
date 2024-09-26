package EstruturaSequencialWesley;

import java.util.Scanner;
public class Pratica7 {
    public static void main(String[] args) {
        
        //Criar scanner para receber o valor do salário mínimo atual e o do usuário
        Scanner scanner = new Scanner(System.in);

        //Introdução
        System.out.println("Você gostaria de saber quantos salários mínimos você recebe?");
        System.out.println("");

        //Pedir ao usuário o valor dos salários
        System.out.println("Insira o valor do salário mínimo ~ATUAL~:");
        Double salariomA = scanner.nextDouble();

        System.out.println("Insira o valor do ~SEU~ salário: ");
        Double salarioU = scanner.nextDouble();

        //Cálculo
        Double salarios = salarioU / salariomA;

        //Exibir resultados
        System.out.println("Você recebe um total de " + salarios + " salários mínios.");

        //Fechar
        scanner.close();
    }
    
}

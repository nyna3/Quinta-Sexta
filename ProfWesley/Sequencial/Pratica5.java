package EstruturaSequencialWesley;

import java.util.Scanner;
public class Pratica5 {
    public static void main(String[] args) {
        //Criar um scanner para receber as diagonais de um losango
        Scanner scanner = new Scanner(System.in);

        //Introdução
        System.out.println("Quer saber a área de um losango?");
        System.out.println("");
        
        //Pedir ao usuário o valor da diagonais
        System.out.println("Informe o valor da diagonal ~MAIOR~:");
        Double dmaoir = scanner.nextDouble();

        System.out.println("Informe o valor da diagonal ~MENOR~: ");
        Double dmenor = scanner.nextDouble();

        //Cálculo
        Double area = (dmaoir * dmenor) / 2;

        //Exibir resultados
        System.out.println("A área do losango é igual a: " + area);

        //Fechar
        scanner.close();
        
    }
    
}

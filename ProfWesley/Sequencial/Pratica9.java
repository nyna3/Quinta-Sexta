package EstruturaSequencialWesley;

import java.util.Scanner;
public class Pratica9 {
    public static void main(String[] args) {
        
        //Criar um scanner para receber os valores dos catetos
        Scanner scanner = new Scanner(System.in);

        //Introdução
        System.out.println("Quer saber qual é a hipotenusa de seus catetos?");
        System.out.println("");

        //Pedir ao usuário o valor dos catetos
        System.out.println("Insira o valor do cateto b: ");
        int b = scanner.nextInt();

        System.out.println("Insira o valor do cateto c: ");
        int c = scanner.nextInt();

        //Calcular
        Double be = Math.pow(b,2);
        Double ce = Math.pow(c, 2);
        Double bc = be + ce;
        Double hipotenusa = Math.sqrt(bc);

        //Exibir resultados
        System.out.println("A hipotenusa de seus catetos é: " + hipotenusa);

        //Fechar
        scanner.close();

    }
    
}

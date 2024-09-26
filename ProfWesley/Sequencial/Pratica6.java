package EstruturaSequencialWesley;

import java.util.Scanner;
public class Pratica6 {
    public static void main(String[] args) {
        
        //Cria um scanner para receber a temperatura em Celsius.
        Scanner scanner = new Scanner(System.in);
        
        //Introdução
        System.out.println("Você gostaria de saber qual a temperatura em Fahrenheit (ºF)?");
        System.out.println("");

        //Pedir ao usuário para incerir a temperatura.
        System.out.println("Insira a temperatura em Celsius (ºC):");
        Double tempc = scanner.nextDouble();

        //Cálculo
        Double tempf= (tempc*1.8) + 32;

        //Exibir resultados
        System.out.println("A temperatura em Fahrenheit (ºF) é: " + tempf + "ºF");

        //Fechar
        scanner.close();
    }
    
}

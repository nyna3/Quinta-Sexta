package EstruturaSequencialWesley;

import java.util.Scanner;
public class Pratica3 {
    public static void main(String[] args) {

        //Criar scanner para receber cotação e quantos dolares o usuário possui
        Scanner scanner = new Scanner(System.in);

        //Introdução
        System.out.println("Você gostaria de saber quantos reais possui?");
        
        //Pedir ao usuário para inserir a cotação atual do Dolar e quantos Dólares possui.
        System.out.println("Informe qual a cotação atual do dólar?");
        Double cotd = scanner.nextDouble();

        System.out.println("Informe agora quantos dólares você possui?");
        Double dusu = scanner.nextDouble();
        
        //Cáculo
        Double reais = cotd * dusu;

        //Exibir resultados
        System.out.println("Você possui um total de R$" + reais + ".");

        //Fechar
        scanner.close();
    }
}
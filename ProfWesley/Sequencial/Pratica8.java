package EstruturaSequencialWesley;

import java.util.Scanner;
public class Pratica8 {
    public static void main(String[] args) {

        //Criar scanner para receber o peso do usuário
        Scanner scanner = new Scanner(System.in);

        //Introdução
        System.out.println("Sabe quanto você pesaria se engourdasse 15%? E se emagrecesse 20%? ficou curiso(a)? Responda algumas perguntas e saberá. ");
        System.out.println("");

        //Pedir ao usuário para inserir seu peso
        System.out.println("Diga-nos o seu peso: ");
        Double peso = scanner.nextDouble();

        //Cálculos
        Double engordar = (peso * 0.15) + peso;
        Double emagrece = (peso * 0.20);
        Double emagrecer = peso - emagrece;

        //Exibir resultados
        System.out.println("Se você engordar 15%, seu peso será: " + engordar + "kg.");
        System.out.println("Já se você emagrecer 20% seu peso será de: " + emagrecer + "kg.");

        //Fechar
        scanner.close();
    }
}

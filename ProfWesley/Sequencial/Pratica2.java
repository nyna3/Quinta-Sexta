package EstruturaSequencialWesley;

import java.util.Scanner;
public class Pratica2{

    public static void main(String[] args) {
        
        //Cria um scanner para ano do nascimento do usuário e o ano atual.
        Scanner scanner = new Scanner(System.in);

        //Pedir ao usuário para inserir o ano em que nasceu e o ano atual.
        System.out.println("Para saber quantos anos tem e quantos anos terá em 2050 insira: ");
        System.out.println("Seu ~ANO~ de nascimento: ");
        int anon = scanner.nextInt();

        System.out.println("O ano atual: ");
        int anoa = scanner.nextInt();

        //Calcular as idades
        int idadea = (anoa - anon);
        
        int idade2050 = (2050 - anon);

        //Exibir os resultados
        System.out.println("Sua idade atual é: "+ idadea);

        System.out.println("Sua idade no ano de 2050 será: " + idade2050);

        //Fechar
        scanner.close();
    }
}
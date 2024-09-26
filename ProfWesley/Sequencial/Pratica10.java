package EstruturaSequencialWesley;

import java.util.Scanner;
public class Pratica10 {
    public static void main(String[] args) {
        
        //Criar scanner para receber o raio
        Scanner scanner = new Scanner(System.in);

        //Introdução
        System.out.println("Gostaria de saber o comprimento, área e volume de uma esfera?");
        System.out.println("");

        //Pedir ao usuário para inserir o raio
        System.out.println("Insira o valor do raio da esfera: ");
        Double raio = scanner.nextDouble();

        //Calcular
        
        Double comprimento = 2 * Math.PI * raio;

        Double area = 4 * Math.PI * Math.pow(raio, 2);

        Double volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;

        //Exibir respostas
        System.out.println("O comprimento da esfera é:" + comprimento);
        System.out.println("A área da esfera é: " + area );
        System.out.println("O volume da esfera é: " + volume);

        //Fechar
        scanner.close();
    }
    
}

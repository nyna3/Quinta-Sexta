package EstruturaSequencialMark;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        //Criar um scanner para recebera temperatura em Celsius
        Scanner scanner = new Scanner (System.in);

        //Pedir ao usuário para inserir o valor da temperatura em Celsius
        System.out.print("Digite a temperatura (ºC): ");
        Double temperaturac = scanner.nextDouble();

        //Calcular a temperatura em Fahrenheit
        Double temperaturaf = ((temperaturac * 1.8) + 32);

        //Exibir resultado
        System.out.println("A temperatura em Fahrenheit (ºF) é: " + temperaturaf);

        //Fechamento
        scanner.close();
    }
}
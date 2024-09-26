package EstruturaSequencialMark;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        //Criar um objeto scanner para capturar a cotação atual do dólar
        Scanner scanner = new Scanner (System.in) ;

        //Pedir para o usuário inserir a cotação atual do dolar
        System.out.print("Insira a cotação atual do dolar: ");
        Double cotacaoatualdodolar = scanner.nextDouble();

        //Pedir para o usuário inserir quantos dolares ele possui
        System.out.print("Insira quantos dolares você possui: ");
        Double dolaresadquiridos = scanner.nextDouble();

        //Calcular quantos reais o usuário possui
        Double reaistotais = cotacaoatualdodolar * dolaresadquiridos;

        //Exibir resultado
        System.out.println("Você possui um total de: " + reaistotais );

        //Fechamento
        scanner.close();

    }
}
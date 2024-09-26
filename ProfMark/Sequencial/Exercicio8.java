package EstruturaSequencialMark;
import java.util.Scanner;

public class Exercicio8{

    public static void main(String[] args) {

        //Criar um scanner para receber o valor a calcular a tabuada
            Scanner scanner = new Scanner(System.in);

            //Pedir ao usuário para inserir o valor da tabuada
            System.out.print("Favor inserir o valor para o cálculo de sua tabuada: ");
            int valor = scanner.nextInt();

            //Exibir a tabuada do valor inserido
            System.out.println("Você inseriu o valor: " + valor);
            System.out.println("A tabuada do " + valor + " é: ");
            System.out.print("");
            for (int m = 1; m <= 10; m++) {
                int resultado = valor * m;
                System.out.println(valor + "x" + m + "=" + resultado);

                //Fechamento
                scanner.close();
            }

        }

    }
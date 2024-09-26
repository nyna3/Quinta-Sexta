package EstruturaSequencialMark;
import java.util.Scanner;

public class Exercicio9{

    public static void main(String[] args) {
        
        //Criar um scanner para receber um número inteiro.
        Scanner scanner = new Scanner(System.in);

        //Pedir ao usuário para inserir um número inteiro
        System.out.print("Favor inserir um número inteiro: ");
        int numeroi = scanner.nextInt();

        //Calcular o número inserido ao quadrado
        Double nquadrado = Math.pow(numeroi,2);

        //Calcular o múmero inserido ao cubo
        Double ncubo = Math.pow(numeroi,3);

        //Calcular a raiz quadrada do número inserido
        Double nraiz = Math.sqrt(numeroi);

        //Calcular a raiz cúbica do número inserido
        Double nrcubica = Math.cbrt(numeroi);

        //Exibir os resultados
        //Ao quadrado
        System.out.println("O " + numeroi + " ao quadrado é: " + nquadrado);

        //Ao cubo
        System.out.println("O " + numeroi + " ao cubo é: " + ncubo);

        //Raiz quadrada
        System.out.println("A raiz quadrada de " + numeroi + " é: " + nraiz);

        //Raiz cúbica
        System.out.println("A raiz cúbica de " + numeroi + " é: " + nrcubica );

        //Fechamento
        scanner.close();

    }
}
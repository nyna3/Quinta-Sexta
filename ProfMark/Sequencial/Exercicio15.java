package EstruturaSequencialMark;
import java.util.Scanner;

public class Exercicio15{

    public static void main(String[] args) {
        
        //Criar um scanner para receber eleitores e votos
        Scanner scanner = new Scanner(System.in);

        //Pedir para o usuário inserir o número total de eleitores, de votos do primeiro e segundo candidato
        System.out.println("Quer saber quantos por cento cada um dos dois candidato receberam nesse eleição?");
        System.out.println("");
        System.out.print("Insira o número total de eleitores: ");
        int eleitor = scanner.nextInt();

        System.out.print("Insira o número de votos do primeiro candidato: ");
        int votos1 = scanner.nextInt();

        System.out.print("Insira o número de votos do segundo candidato: ");
        int votos2 = scanner.nextInt();

        //Calculos
        int totalv = votos1 + votos2;

        int nulos = eleitor - totalv;

        Double pv1 = votos1 / (double) eleitor;

        Double pv2 = votos2 / (double) eleitor;

        Double nulosf = nulos / (double) eleitor;

        Double pv1f = pv1 * 100;

        Double pv2f = pv2 * 100;

        Double nulosff = nulosf * 100;

        //Exibir os resultados
        System.out.println("O primeiro candidato teve " + votos1 + " votos.");
        System.out.println("O segundo candidato teve " + votos2 + " votos.");
        System.out.println("O primeiro candidato teve " + pv1f + "% de votos.");
        System.out.println("O segundo candidato teve " + pv2f + "% de votos.");
        System.out.println("Sendo assim ficaram " + nulosff + "% de votos nulos.");

        //Fechamento
        scanner.close();

    }
}

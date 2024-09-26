package EstruturaSequencialMark;
import java.util.Scanner;
import java.time.LocalDate;

public class Exercicio2 {
    public static void main(String[] args) {
        //Criar um objeto scanner para capturar o ano em que o usuário nasceu
        Scanner scanner = new Scanner (System.in) ;

        //Pedir ao usuário para inserir sua data de nascimento
        System.out.print("Digite o ano em que você nasceu: ");
        int anodenascimento = scanner.nextInt();

        //Obter o ano atual usando a classe "LocalDate"
        int anoatual = LocalDate.now().getYear();

        //Calcular a idade atual do usuário
        int idadeatual = anoatual - anodenascimento;

        //Cacular a idade no ano de 2050
        int idadeem2050 = 2050 - anodenascimento;

        //Exibir os resultados
        System.out.println("Sua idade no ano de (" + anoatual + ") é: " + idadeatual );

        System.out.println("Sua idade no ano de 2050 será: " + idadeem2050 );

        //Fechamento
        scanner.close();

    }
}
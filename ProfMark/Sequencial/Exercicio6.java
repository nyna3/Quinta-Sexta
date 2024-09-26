package EstruturaSequencialMark;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        //Criar um sacanner para pedir ao usuário os coeficientes a, b e c 
        Scanner scanner = new Scanner (System.in);

        //Pedir para o usuário inserir os coeficientes
        System.out.print("Digite o coeficiente ~a~: ");
        Double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente ~b~: ");
        Double b = scanner.nextDouble();

        System.out.print("Digite o coeficiente ~c~: ");
        Double c = scanner.nextDouble();

        //Calcular as raízes da equação
        Double delta = (b * b - 4 * a * c);

        Double raizd = Math.sqrt(delta);

        Double raiz1 = (-b + raizd) / (2 * a);
        Double raiz2 = (-b - raizd) / (2 * a);

        //Exibir os resultados
        System.out.print("Raiz 1 (x1) é: " + raiz1);

        System.out.print("Raiz 2 (x2) é: " + raiz2);

        //Fechamento
        scanner.close();

    }
}
package EstruturaSequencialWesley;

import javax.swing.JOptionPane;
public class Pratica5JO {
    public static void main(String[] args) {
        try {
            //Introdução
            JOptionPane.showMessageDialog(null, "Você gostaria de saber a área do losango? Nos dê algumas informações e saberá ok?");

            //Pedir ao usuário as diagonais do losango
            String dmaior = JOptionPane.showInputDialog("Insira o valor da diagonal ~MAIOR~:");
            String dmenor = JOptionPane.showInputDialog("Insira o valor da diagonal ~MENOR~:");

            //Converter
            Double dmaiorC = Double.parseDouble(dmaior);
            Double dmenorC = Double.parseDouble(dmenor);

            //Cálculo
            Double area = (dmaiorC * dmenorC) / 2;

            //Exibir resultado
            JOptionPane.showMessageDialog(null, "A área do losango é: " + area);

        }catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null, "ERRO: Dados incorretos. Por favor, tente novamente.");
        }
    }
}

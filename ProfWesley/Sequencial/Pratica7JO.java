package EstruturaSequencialWesley;

import javax.swing.JOptionPane;
public class Pratica7JO {
    public static void main(String[] args) {
        try {
            //Introdução
            JOptionPane.showMessageDialog(null, "Você gostaria de saber quantos salários mínimos você recebe? Nos dê algumas informações e saberá, ok?");
            
            //Pedir ao usuário para inserir o valor dos salários
            String sma = JOptionPane.showInputDialog("Insira o valor do salário mínimo ~ATUAL~:");
            String smu = JOptionPane.showInputDialog("Insira o valor do ~SEU~ salário:");

            //Conversão
            Double smaC = Double.parseDouble(sma);
            Double smuC = Double.parseDouble(smu);

            //Cálculos
            Double salarios = smuC / smaC;

            //Exibir resultados
            JOptionPane.showMessageDialog(null, "Você recebe um total de " + salarios + " salários mínimos");
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO: Dados incorretos. Por favor, tente novamente.");
        }
    }
    
}

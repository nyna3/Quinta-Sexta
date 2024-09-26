package EstruturaSequencialWesley;

import javax.swing.JOptionPane;
public class Pratica6JO {
    public static void main(String[] args) {
        try {
            //Introdução
            JOptionPane.showMessageDialog(null, "Você gostaria de saber a sua temperatura em Fahrenheit (ºF)? Nos dê algumas informações e você saberá, ok?");

            //Pedir ao usuário para inserir a temperatura em Celsius
            String tempc = JOptionPane.showInputDialog("Isira a sua temperatura (ºC):");

            //Converter
            Double Tempc = Double.parseDouble(tempc);

            //Cálculo
            Double Tempf = (Tempc * 1.8) + 32;

            //Exibir resultado
            JOptionPane.showMessageDialog(null, "A sua temperatura em Fahrenheit (ºF) é: " + Tempf );

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO: Dados incorretos. Por favor, tente novamente.");
        }
    }
    
}

package EstruturaSequencialWesley;

import javax.swing.JOptionPane;
public class Pratica11JO {
    public static void main(String[] args) {
        try{
            //Introdução
            JOptionPane.showMessageDialog(null, "Gostaria de saber a tabuada de qualquer número? Aperte ok e nos diga qualquer um!");

            //Pedir ao usuario para inserir o valor da tabuada
            String valo = JOptionPane.showInputDialog("Inserira o valor para o cálculo de sua tabuada: ");

            //Conversão
            int valor = Integer.parseInt(valo);

            //Criar uma String para a tabuada
            StringBuilder tabuada = new StringBuilder();

            //Introdução cálculos
            JOptionPane.showMessageDialog(null, "A tabuada do " + valor + " é:" );

            //Cálculos
            for (int i = 1; i <= 10; i++) {
                int resultado = valor * i;
                tabuada.append(valor).append(" x ").append(i).append(" = ").append(resultado).append("\n");
            }

            //Exibição
            JOptionPane.showMessageDialog(null, tabuada.toString(), "Tabuada do " + valor, JOptionPane.INFORMATION_MESSAGE);

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO: Dados incorretos. Por favor, tente novamente.");
        }
        
    }
    
}
package EstruturaSequencialWesley;

import javax.swing.JOptionPane;
public class Pratica10JO {
    public static void main(String[] args) {
        try{
            //Introdução
            JOptionPane.showMessageDialog(null, "Gostaria de saber o comprimento, área e volume de uma esfera?");

            //Pedir ao usuario para inserir o raio
            String rai = JOptionPane.showInputDialog("Insira o valor do raio da esfera: ");

            //Conversão
            Double raio = Double.parseDouble(rai);

            //Cálculos
            Double comprimento = 2 * Math.PI * raio;

            Double area = 4 * Math.PI * Math.pow(raio, 2);

            Double volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;

            //Exibir resultados
            JOptionPane.showMessageDialog(null, "O comprimento da esfera é:" + comprimento);
            JOptionPane.showMessageDialog(null, "A área da esfera é: " + area);
            JOptionPane.showMessageDialog(null, "O volume da esfera é: " + volume);

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO: Dados incorretos. Por favor, tente novamente.");
        }
        
    }
    
}

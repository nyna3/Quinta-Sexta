package EstruturaSequencialWesley;

import javax.swing.JOptionPane;
public class Pratica9JO {
    public static void main(String[] args) {
        try{
            //Introdução
            JOptionPane.showMessageDialog(null, "Quer saber qual é a hipotenusa de seus catetos? Aperte logo o ok e vamos lá!!");

            //Pedir ao usuáro os catetos
            String B = JOptionPane.showInputDialog("Informe o cateto ~b~:");
            String C = JOptionPane.showInputDialog("Informe o cateto ~c~:");

            //Converter
            Double b = Double.parseDouble(B);
            Double c = Double.parseDouble(C);

            //Calcular
            Double be = Math.pow(b,2);
            Double ce = Math.pow(c, 2);
            Double bc = be + ce;
            Double hipotenusa = Math.sqrt(bc);

            //Exibir resultados
            JOptionPane.showMessageDialog(null, "A hipotenusa de seus catetos é: " + hipotenusa);

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO: Dados incorretos. Por favor, tente novamente.");
        }
    }
    
}

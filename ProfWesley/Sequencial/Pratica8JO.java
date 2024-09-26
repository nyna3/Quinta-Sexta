package EstruturaSequencialWesley;

import javax.swing.JOptionPane;
public class Pratica8JO {
    public static void main(String[] args) {
        try{
            //Introdução
            JOptionPane.showMessageDialog(null, "Sabe quanto você pesaria se engourdasse 15%? E se emagrecesse 20%? ficou curiso(a)? Dê ok e venha saber.");

            //Pedir ao usuário o valor de seu peso
            String pes = JOptionPane.showInputDialog("Quanto você pesa?");

            //Converter
            Double peso = Double.parseDouble(pes);

            //Calcular
            Double engordar = (peso * 0.15) + peso;
            Double emagrece = (peso * 0.20);
            Double emagrecer = peso - emagrece;

            //Exibir Resultados
            JOptionPane.showMessageDialog(null, "Se você engordar 15%, seu peso será: " + engordar + "kg.");
            JOptionPane.showMessageDialog(null, "Já se você emagrecer 20% seu peso será de: " + emagrecer + "kg.");
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO: Dados incorretos. Por favor, tente novamente.");
        }
    }
    
}

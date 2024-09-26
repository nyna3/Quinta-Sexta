package EstruturaSequencialWesley;

import javax.swing.JOptionPane;
public class Pratica1JO{

    public static void main(String[] args) {
        try{

        //Introdução
        JOptionPane.showMessageDialog(null, "Você gostaria de saber a média aritimética de três valores, ok? ");
            
        //Pedir as três notas do usuário
        String nota1 = JOptionPane.showInputDialog("Insira a primeira nota: ");

        String nota2 = JOptionPane.showInputDialog("insira a segunda nota: ");

        String nota3 = JOptionPane.showInputDialog("insira a treceira nota: ");

        //Converter os valores inseridos
        Double nota1C = Double.parseDouble(nota1);

        Double nota2C = Double.parseDouble(nota2);

        Double nota3C = Double.parseDouble(nota3);

        //Calcular a média aritimética
        double media = (nota1C + nota2C + nota3C) / 3;

        //Exibir resultados
        JOptionPane.showMessageDialog(null, "A média aritimética das notas inseridas é: " + media);

        } catch (NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Erro: Dados inválidos. Por favor, tente novamente.");
        }
    }
}
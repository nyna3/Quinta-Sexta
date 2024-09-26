package EstruturaSequencialWesley;

import javax.swing.JOptionPane;
public class Pratica3JO {
    public static void main(String[] args) {
        try {

            //Introdução
            JOptionPane.showMessageDialog(null, "Você quer saber quantos Reais possui? Responda as perguntas a seguir ok?");

            //Pedir a cotação do Dolar e quantos Dólares possui
            String Datual = JOptionPane.showInputDialog("Qual a cotação atual do Dólar?");
            String Dp = JOptionPane.showInputDialog("Quantos Dólares você possui?");

            //Conversão de dados
            Double DatualC = Double.parseDouble(Datual);
            Double DpC = Double.parseDouble(Dp);

            //Cálculos
            Double reais = DpC * DatualC;

            //Exibir resultado
            JOptionPane.showMessageDialog(null, "Você possui um total de R$" + reais + "." );

            //Caso haja algum dado inválido
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO: Dados inválidos. Por favor, tente novamente.");
        }

        }
    }

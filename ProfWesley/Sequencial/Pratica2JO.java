package EstruturaSequencialWesley;

import javax.swing.JOptionPane;
public class Pratica2JO{

    public static void main(String[] args) {
        try {
            //Introdução
        JOptionPane.showMessageDialog(null, "Você gostaria de saber quantos anos tem e quantos anos terá em 2050, ok? ");
        
        //Receber ano de nascimento do usuário e ano atual.
        String anon = JOptionPane.showInputDialog(null, "Insira o seu ~ANO~ de nascimento: ");
        
        String anoatu = JOptionPane.showInputDialog(null, "Insira o ano ATUAL: ");

        //Converter dados
        int anonC = Integer.parseInt(anon);
        int anoatuC = Integer.parseInt(anoatu);

        //Calculos
        int anost = anoatuC - anonC;
        int anosvt = 2050 - anonC;

        //Exibir resultados
        JOptionPane.showMessageDialog(null, "No ano atual você possui " + anost + " anos.");
        JOptionPane.showMessageDialog(null, "Já em 2050, você terá " + anosvt + " anos.");

        }catch (NumberFormatException e) {
            //Caso haja informações erradas
        JOptionPane.showMessageDialog(null,"ERRO: Dados inválidos. Por favor tente novamente.");
        }

    }
}

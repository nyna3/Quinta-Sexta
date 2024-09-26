package EstruturaSequencialWesley;

import javax.swing.JOptionPane;
public class Pratica4JO {
    public static void main(String[] args) {
        try {
                    
        //Introdução
        JOptionPane.showMessageDialog(null, "Seu salário aumentou 25%!! Quer saber quanto irá passar a ganhar? Responda a pergunta a seguir. Ok?");
        
        //Pedir ao usuário para inserir o valor do seu salário
        String salario = JOptionPane.showInputDialog("Informe o valor ~ATUAL~ do seu salário: ");

        //Coversão
        Double Salario = Double.parseDouble(salario);

        //Calculo
        Double aumento = (Salario * 0.25) + Salario;

        //Exibir resultados
        JOptionPane.showMessageDialog(null, "Seu salário atual é: R$" + aumento + ".");

        //Caso de erro
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO: Dados incorretos. Por favor, tente novamente.");

        }

    }
    
}

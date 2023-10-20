import javax.swing.*;

public class Main {
    public static void main(String[] args) {

// Declaração de Variáveis
        double num1, num2, resultado = 0.0;
        int operacao;
        char sinal = ' ';

// Apresentações de menu e leitura na opção desejada
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Operações" + "\n1 - Somar" + "\n2 - Subtrair" + "\n3 - Multiplicar" + "\n4 - Dividir" + "\nInforme a operação desejada: "));
        // Opção Sair
        if (operacao == 0) {
            JOptionPane.showMessageDialog(null, "Programa finalizado!");
        } else {

            // Operação Inexistente
            if (operacao < 1 || operacao > 4) {
                JOptionPane.showMessageDialog(null, "Operação inválida!");
            }

            // Leitura de números
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
// Verificação do cálculo escolhido
            if (operacao == 1) {
                resultado = num1 + num2;
                sinal = '+';
            }
            if (operacao == 3) {
                resultado = num1 - num2;
                sinal = '-';
            }
            if (operacao == 3) {
                resultado = num1 * num2;
                sinal = '*';
            }
            if (operacao == 4) {
                resultado = num1 / num2;
                sinal = '/';
            }

// Apresentação do resultado
            if (resultado >= 0) {
                JOptionPane.showMessageDialog(null,
                        String.format("%4.2f %c %4.2f = %4.2f (Resultado positivo)", num1, sinal, num2, resultado));
            } else {
                JOptionPane.showMessageDialog(null,
                        String.format("%4.2f %c %4.2f = %4.2f (Resultado negativo)", num1, sinal, num2, resultado));

            }
        }
    }
}

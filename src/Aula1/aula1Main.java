package Aula1;

import javax.swing.JOptionPane;

public class aula1Main {
    public static void main(String[] args) {
        int escolha = 0;
        Invertido vetores = new Invertido();
        TresVetores matriz = new TresVetores();
        Binario binario = new Binario();
        Decimal decimal = new Decimal();
        Object[] interacoes = { "Inverter valores", "Matriz 8x3", "Binario para decimalo", "Decimal para binario",
                "Terminar exercicio" };

        JOptionPane.showMessageDialog(null, "Exercicio da Primeira aula" + //
                "\nGabriel Antunes - 240519");

        do {

            escolha = JOptionPane.showOptionDialog(null, "Qual exercicio voce gostaria de fazer?", "Painel de escolha",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, interacoes, interacoes[0]);

            switch (escolha) {
                case 0:
                    int vetor[] = new int[8];
                    for (int i = 0; i < 8; i++) {
                        vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
                    }
                    vetores.setVetor(vetor);
                    vetores.inverter();
                    vetores.mostrarInvertido();
                    break;

                case 1:
                    int vetor1[] = new int[8];
                    int vetor2[] = new int[8];
                    int vetor3[] = new int[8];

                    JOptionPane.showMessageDialog(null, "vamos inserir o valor do vetor 1:");
                    for (int i = 0; i < 8; i++) {
                        vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor:"));
                        matriz.setVetor1(vetor1);
                    }
                    JOptionPane.showMessageDialog(null, "vamos inserir o valor do vetor 2:");
                    for (int i = 0; i < 8; i++) {
                        vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor:"));
                        matriz.setVetor2(vetor2);
                    }
                    JOptionPane.showMessageDialog(null, "vamos inserir o valor do vetor 3:");
                    for (int i = 0; i < 8; i++) {
                        vetor3[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor:"));
                        matriz.setVetor3(vetor3);
                    }

                    matriz.mostrarMatriz();
                    break;

                case 2:
                    String numero = "";
                    numero = JOptionPane.showInputDialog("Vamos digitar o numero:");
                    binario.setNumero(numero);

                    binario.converter(numero);
                    binario.mostrarDecimal();

                    break;

                case 3:
                    int num;

                    num = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor:"));

                    decimal.convertDecimal(num);
                    decimal.mostrarBinario();

                    break;
                default:
                    break;
            }

        } while (escolha != 4);
    }
}

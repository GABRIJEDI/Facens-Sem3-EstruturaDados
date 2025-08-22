package Aula1;

import java.util.Scanner;

public class aula1Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int escolha = 0;
        Invertido vetores = new Invertido();
        TresVetores matriz = new TresVetores();
        Binario binario = new Binario();
        Decimal decimal = new Decimal();

        System.out.println("\nExercicio da Primeira aula");
        System.out.println("\nGabriel Antunes - 240519");

        do {
            System.out.println("\nQual exercicio voce gostaria de fazer?");
            System.out.println("(1)Inverter valores");
            System.out.println("(2)Matriz 8x3");
            System.out.println("(3)Binario para decimal");
            System.out.println("(4)Decimal para binario");
            System.out.println("(0)Terminar exercicio");
            escolha = scn.nextInt();
            scn.nextLine();

            switch (escolha) {
                case 1:
                    int vetor[] = new int[8];
                    for (int i = 0; i < 8; i++) {
                        System.out.println("Insira o numero:");
                        vetor[i] = scn.nextInt();
                        scn.nextLine();
                    }
                    vetores.setVetor(vetor);
                    vetores.inverter();
                    vetores.mostrarInvertido();
                    break;

                case 2:
                    int vetor1[] = new int[8];
                    int vetor2[] = new int[8];
                    int vetor3[] = new int[8];

                    System.out.println("vamos inserir o valor do vetor 1:");
                    for (int i = 0; i < 8; i++) {
                        System.out.println("Insira o valor:");
                        vetor1[i] = scn.nextInt();
                        scn.nextLine();
                        matriz.setVetor1(vetor1);
                    }
                    System.out.println("vamos inserir o valor do vetor 2:");
                    for (int i = 0; i < 8; i++) {
                        System.out.println("Insira o valor:");
                        vetor2[i] = scn.nextInt();
                        scn.nextLine();
                        matriz.setVetor2(vetor2);
                    }
                    System.out.println("vamos inserir o valor do vetor 3:");
                    for (int i = 0; i < 8; i++) {
                        System.out.println("Insira o valor:");
                        vetor3[i] = scn.nextInt();
                        scn.nextLine();
                        matriz.setVetor3(vetor3);
                    }

                    matriz.mostrarMatriz();
                    break;

                case 3:
                    String numero = "";
                    System.out.println("Vamos digitar o numero:");
                    numero = scn.nextLine();
                    binario.setNumero(numero);

                    binario.converter(numero);
                    binario.mostrarDecimal();

                    break;

                case 4:
                    int num;

                    System.out.println("Digite o numero: ");
                    num = scn.nextInt();
                    scn.nextLine();

                    decimal.convertDecimal(num);
                    decimal.mostrarBinario();

                    break;
                default:
                    break;
            }

        } while (escolha != 0);
    }
}

package Aula1;

import java.util.Arrays;

public class Invertido {
    private int[] vetor = new int[8];
    private int[] vetorInvertido = new int[8];

    public int[] getVetor() {
        return vetor;
    }

    public int[] getVetorInvertido() {
        return vetorInvertido;
    }

    public void setVetor(int[] vetor) {
        if (vetor.length == 8) {
            this.vetor = vetor;
        } else {
            System.out.println("O vetor precisa ter 8 elementos.");
        }
    }

    public void inverter() {
        for (int i = 0; i < vetor.length; i++) {
            vetorInvertido[i] = vetor[vetor.length - 1 - i];
        }
    }

    public void mostrarInvertido() {
        System.out.println(Arrays.toString(vetorInvertido));
    }
}

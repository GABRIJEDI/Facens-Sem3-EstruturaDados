package Aula2;

public class testeFila {
    public static void main(String[] args) {
        // classe para testar o codigo
        Fila minhaFila = new Fila();
        
        if(minhaFila.tamanho()==0){
            System.out.println("tamanho igual a zero");
        }
        else{
            System.out.println("tamanho diferente de zero");
        }

        // se nao for imprementado a rotina de protecao
        // o codigo ira quebrar nesse ponto
        minhaFila.remover();
        minhaFila.exibirInicio();

        minhaFila.adicionar("R");
        minhaFila.adicionar("t");
        minhaFila.adicionar("g");
        minhaFila.adicionar("v");
        minhaFila.adicionar("c");

        if(minhaFila.tamanho()==5){
            System.out.println("tamanho ok");
        }
        else{
            System.out.println("Tamanho incorreto");
        }
        while(minhaFila.tamanho()>0){
            System.out.println(minhaFila.remover());
        }
        System.out.println("deu certo");
    }
}

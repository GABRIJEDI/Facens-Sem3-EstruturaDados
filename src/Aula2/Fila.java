package Aula2;

import java.util.List;
import java.util.ArrayList;

public class Fila{
    List<Object> lista = new ArrayList<Object>();

    public void adicionar(Object item){
        // adiciona ao final da fila
        lista.add(item);
    }

    public Object remover(){
        // remove do inicio da fila
        return lista.remove(0);
    }

    public Object exibirInicio(){
        // exibe o valor no inicio da fila sem remover
        return lista.get(0);
    }

    public int tamanho(){
        // retorna o tamanho da fila
        return lista.size();
    }

}
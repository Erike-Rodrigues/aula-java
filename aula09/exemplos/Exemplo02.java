package exemplos;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        // forma 1
        // System.out.println(lista);

        // forma 2
        for (int i = 0; i < lista.size(); i++) { // size é a quantidade de itens na lista
            System.out.println(lista.get(i)); // get pega um elemento do indice i.
        }

        for (Integer item : lista) { // para cada (foreach) "item" do tipo integer da lista faça
            System.out.println(item);
        }

    }
}

package exemplos;

public class Exemplo02 {

    public static void main(String[] args) {
        int retorno;

        retorno = soma(10,20); // recebe o retorno do método

        System.out.println("Resultado: " + retorno);
        
    } // Fim do Main........

    // inicio do método soma. recebe 2 parametro int, retorna um int.
    static int soma(int n1, int n2){
        int resultado;

        resultado = n1 + n2;

        return resultado; // devolve o tipo declarado no método.
        
    } // fim do método soma.
    
    
}

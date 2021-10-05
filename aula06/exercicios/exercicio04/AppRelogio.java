package exercicios.exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(15, 46, 00);
        System.out.println("Hora atual: " + relogio.getHora());
        
        relogio.setHora(7);
        System.out.println("Hora atual: " + relogio.getHora());
        relogio.exibir();
    }

    
}

package aula08;

import java.util.Random;

public class Aula08 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[10];
        l[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        l[6] = new Lutador("Maricona", "Brasil", 26, 1.75f, 69.2f, 6, 4, 5);
        l[7] = new Lutador("Ismael", "Brasil", 21, 1.50f, 56.5f, 3, 6, 2);
        l[8] = new Lutador("Caio", "Brasil", 21, 1.76f, 75.2f, 6, 2, 1);
        l[9] = new Lutador("Alefe", "Brasil", 20, 1.74f, 94.5f, 2, 7, 2);
        
        
        boolean aprovada = false;
        
        while (!aprovada){
        Random escolha = new Random();
        int l1 = escolha.nextInt(10);
        int l2 = escolha.nextInt(10);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[l1], l[l2]);
        
            if (UEC01.isAprovada()) {
                for (int i = 0; i < UEC01.getRounds(); i++) {
                    UEC01.lutar();
                }
                aprovada = true;
                l[l1].status();
                l[l2].status();
            }
        }
    }
}

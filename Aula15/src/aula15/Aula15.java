package aula15;
public class Aula15 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO.");
        v[1] = new Video("Aula 12 de PHP.");
        v[2] = new Video("Aula 10 de HTML5.");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Alefe Filipe", "M", 20, "Lipe_Biondes");
        g[1] = new Gafanhoto("Caio Martins", "M", 21, "Caio237");
        
        /*System.out.println(v[0].toString());
        System.out.println(g[0].toString());*/
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[1].toString());
    }
}

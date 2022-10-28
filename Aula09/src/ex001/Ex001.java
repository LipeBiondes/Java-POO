package ex001;

public class Ex001 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Ismael", 21, "M") ;
        p[1] = new Pessoa("Caio", 21, "M");
        
        l[0] = new Livro("As macacas assanhadas", "Miranha Jr.", p[0], 200);
        l[1] = new Livro("A volta dos que nao foram", "Pimponho Skate", p[1], 250);
        l[2] = new Livro("Como goza em 2s", "Rogerio Skylab", p[0], 500);
        
        l[0].folhear(200);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
    }
    
}

package ex002;

public class Ex002 {
    public static void main(String[] args) {
        //Criando pessoas
        Pessoa[] p = new Pessoa[3];
        
        p[0] = new Pessoa("Ismael M.", "M", 21 );
        p[1] = new Pessoa("Caio M.", "M", 21 );
        p[2] = new Pessoa("Alefe F.", "M", 20 );
        
        //Criando Livros
        Livro[] l = new Livro[4];
        
        l[0] = new Livro("Como programar em Java", "Gustavo Guanabara", p[2], 350);
        l[1] = new Livro("Como se casar com Neymar Jr.", "Caio Martins", p[0], 123);
        l[2] = new Livro("As cronicas cronicas", "Zidanny Pacheco", p[1], 233);
        l[3] = new Livro("A vida nao e bela", "Zapunzel Preta", p[1], 342);
        
        p[2].fazerAniver();
        System.out.println(p[2].mostrarStatus());
        
        l[0].abrir();
        System.out.println(l[0].detalhes());
    }
}

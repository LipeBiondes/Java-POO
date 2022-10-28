package ex001;

public class Livro implements Publicacao{
    //Atributos
    private String titulo, autor;
    private Pessoa leitor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    
    //Métodos
    public String detalhes() {
        return "Livro{ " + "titulo: " + titulo + 
                "\n Autor: " + autor + 
                "\n Leitor: " + leitor.getNome() + 
                "\n Idade do leitor: " + leitor.getIdade() +
                "\n Sexo do leitor: " + leitor.getSexo() +
                "\n Total de Paginas: " + totPaginas + 
                "\n Pagina Atual: " + pagAtual + 
                "\n aberto: " + aberto + '}';
    }
    
    //Métodos especiais

    public Livro(String titulo, String autor, Pessoa leitor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p>this.getTotPaginas()) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        if (this.getPagAtual() == this.getTotPaginas()) {
            System.out.println("Voce ja esta na ultima pagina: "+this.getTotPaginas());
        } else {
            this.setPagAtual(this.getPagAtual()+1);
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() == 0) {
            System.out.println("Você já está na primeira pagina: "+this.getTotPaginas());
        } else {
            this.setPagAtual(this.getPagAtual()-1);
        }
    }
}

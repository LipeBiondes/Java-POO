package ex002;

public class Livro implements Publicacao {
    //Atributos
    private String titulo, autor;
    private Pessoa leitor;
    private int totPag, pagAtual;
    private boolean aberto;
    
    //Métodos

    public String detalhes() {
        return "{" + "Titulo do livro: " + titulo + 
                "\n Nome do autor: " + autor + 
                "\n Nome do leitor: " + leitor.getNome()+", idade: "+leitor.getIdade()+ ", sexo: "+leitor.getSexo()+
                "\n Total de Paginas: " + totPag + 
                "\n Pagina atual: " + pagAtual + 
                "\n Esta aberto: " + aberto + '}';
    }
    
    
    //Métodos especiais
    public Livro(String titulo, String autor, Pessoa leitor, int totPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.totPag = totPag;
        this.pagAtual = 0;
        this.aberto = false;
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

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
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
        if (p>this.getTotPag() || p<=0) {
            this.setPagAtual(0);
        }else{
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        if (!aberto && this.getPagAtual() == this.getTotPag()) {
            System.out.println("Ou o livro esta fechado ou voce ja esta na ultima pagina.");
        } else {
            this.setPagAtual(pagAtual++);
        }
    }

    @Override
    public void voltarPag() {
        if (!aberto && this.getPagAtual() == 0) {
            System.out.println("Ou o livro esta fechado ou voce esta na primeira pagina.");
        } else {
            this.setPagAtual(pagAtual--);
        }
    }
}

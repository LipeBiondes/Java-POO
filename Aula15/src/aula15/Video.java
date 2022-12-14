package aula15;
public class Video implements AcoesVideo{

    private String titulo;
    private int views, curtidas, avaliacao;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.views = 0;
        this.curtidas = 0;
        this.avaliacao = 1;
        this.reproduzindo = false;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    @Override
    public void play() {
        if (reproduzindo) {
            System.out.println("O video ja esta sendo reproduzindo.");
        } else {
        System.out.println("O video esta sendo reproduzido.");
        this.setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if (reproduzindo) {
            this.setReproduzindo(false);
            System.out.println("O video esta sendo pausado.");
        } else {
            System.out.println("O video ja esta pausado.");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo do video: " + titulo + 
                ", quantidade de views: " + views + 
                ", Total de likes:" + curtidas + 
                ", avaliacao do video: " + avaliacao + 
                ", reproduzindo:" + reproduzindo + '}';
    }
}

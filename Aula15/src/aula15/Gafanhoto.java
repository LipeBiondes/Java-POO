package aula15;
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;
    
    public Gafanhoto (String nome, String sexo, int idade, String login){
        super (nome, sexo, idade);
        this.totAssistido = 0;
        this.login = login;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido()+1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +super.toString()+ "\nlogin: " + login + 
                ", totAssistido:" + totAssistido + '}';
    }
}

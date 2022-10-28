package aula10;
public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;
    
    //Métodos
    public void cancMatric(){
        System.out.println("Matricula cancelada!");
        this.setMatricula(0);
    }
    
    //Métodos especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

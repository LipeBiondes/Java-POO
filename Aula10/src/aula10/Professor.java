package aula10;
public class Professor extends Pessoa{
    //Atributos
    private float sal;
    private String especialidade;
    
    //Métodos
    public void receberAum(float n){
        this.setSal(this.getSal()+n);
    }
    
    //Métodos especiais
    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

package aula05;

public class ContaBanco {
//Atributos
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldoConta;
    private boolean statusConta;
//Métodos
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public String getDonoConta() {
        return donoConta;
    }
    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }
    public float getSaldoConta() {
        return saldoConta;
    }
    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }
    public boolean isStatusConta() {
        return statusConta;
    }
    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
//Métodos Especiais
    public ContaBanco() {
        this.saldoConta = 0;
        this.statusConta = false;
    }
//Métodos personalizados

    public void estadoAtual(){
        System.out.println("---------------------------------------");
        System.out.println("Numero da conta: " +this.getNumConta());
        if (null == this.getTipoConta()) {
            System.out.println("Tipo de conta: null");
        } else switch (this.getTipoConta()) {
            case "CC" -> System.out.println("Tipo de conta: Corrente");
            case "CP" -> System.out.println("Tipo de conta: Poupanca");
            default -> System.out.println("Tipo de conta: null");
         }
        System.out.println("Conta de: " + this.getDonoConta());
        System.out.println("Saldo da conta: " + this.getSaldoConta());
        if (this.isStatusConta()) {
            System.out.println("Status da conta: Aberta");
        }else{
            System.out.println("Status da conta: Fechada");
        }
    }    
    public void abrirConta(String t){
        this.setTipoConta(t);
        this.setStatusConta(true);
        
        if (null == t) {
            System.out.println("ERROR. Tipo de Conta inválido, usar CC para conta corrente e CP para conta poupanca.");
        } else switch (t) {
            case "Conta Corrente" -> {
                this.setTipoConta("CC");
                this.setSaldoConta(50);
            }
            case "Conta Poupanca" -> {
                this.setTipoConta("CP");
                this.setSaldoConta(150);
            }
            default -> System.out.println("ERROR. Tipo de Conta inválido, usar CC para conta corrente e CP para conta poupanca.");
        }
        System.out.println("Conta Aberta!");
    }
    public void fecharConta(){
        if (this.getSaldoConta() < 0) {
            System.out.println("Saldo de conta negativo, impossivel fechar conta.");
        }else if (this.getSaldoConta() > 0) {
            System.out.println("Saldo de conta disponivel, sacar o dinhero para poder fechar a conta.");
        }else{
            System.out.println("Fechando conta...");
            this.setStatusConta(false);
            this.setTipoConta("");
            System.out.println("Conta fechada!");
        }
    }
    public void depositar(float v){
        if (this.isStatusConta() == true) {
            this.setSaldoConta(this.getSaldoConta()+v);
            System.out.println("Deposito de: " + v + ", realizado na conta de: "+ this.getDonoConta());
        } else{
        System.out.println("Error. Conta fechada!");
        }       
    }
    public void sacar(float v){
        if (this.isStatusConta()) {           
            if (this.getSaldoConta() >= v) {
                this.setSaldoConta(this.getSaldoConta() - v);
                System.out.println("Saque de: "+ v +", na conta de: " + this.getDonoConta());
            }else{
                System.out.println("saldo insuficiente para saque!");
            }            
        }else{
            System.out.println("Conta inesistente.");        
        }
    }
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipoConta())) {
            v = 12;
        }
        else if ("CP".equals(this.getTipoConta())) {
            v = 20;
        }
        if (this.isStatusConta()) {
            if (this.getSaldoConta() > v) {
                this.setSaldoConta(this.getSaldoConta() - v);
                System.out.println("Mensalidade de: " + this.getDonoConta() +", paga com sucesso!");
            }
            else{
                System.out.println("Saldo da conta insuficiente para pagar mensalidade!");
            }            
        }
        else{
            System.out.println("ERROR. conta inexistente!");
        }
    }
}
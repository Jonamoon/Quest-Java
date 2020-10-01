package progcontabanco;

import java.util.Random;

public class ContaBanco {
// atributos
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private double saldo;
    private boolean status;
// métodos
    public ContaBanco() {
        //Random random = new Random();
        //this.numConta = random.nextInt(1000);
        this.saldo = 0.0;
        this.status = false;
    }    
    public void abrirConta(String tipoconta){ //string tipo de conta é recebido por parmetro
        setTipoConta(tipoconta);
        Random random = new Random();
        this.numConta = random.nextInt(1000);
        this.status = true;
        if(this.tipoConta == "CC"){
            this.saldo = 50.0;
        }
        else{
            this.saldo = 150.0;
        }
    }
    public void fecharConta(){
        if(this.saldo < 0.0){
            System.out.println("Não podemos fechar sua conta! poi a mesma esta com débito de: "+this.saldo);
        }
        else{
            System.out.println("Sua conta foi fechada! e seu dinheiro foi jogado fora");
            setSaldo(0.0);
            this.status = false;
        }
    }
    public void depositar(double v){
        if(this.status == true){
        setSaldo(getSaldo() + v);
        }
        else{
            System.out.println("Sem conta cadastrada");
        }
    }
    public void sacar(double v){
         if(this.status == true && this.saldo > v){
            setSaldo(getSaldo() - v);
        
        }
        else{
            System.out.println("Sem saldo suficiente ou sem conta cadastrada");
        }       
    }
    public void pagarMensal(){
        if(this.tipoConta == "CC"){
            this.saldo -= 10.0;
            System.out.println("Foi descontado! seu saldo é: "+this.saldo);
        }
        else{
            this.saldo -= 5.0;
            System.out.println("Foi descontado! seu saldo é: "+this.saldo);
        }
        
    }
    public void resumoConta(){
        System.out.println("Numero da conta: "+this.numConta);
        System.out.println("Tipo da conta: "+this.tipoConta);
        System.out.println("Nome do Dono da conta: "+this.donoConta);
        System.out.println("Saldo da conta: "+getSaldo());
        System.out.println("Saldo da conta: "+isStatus());

    }
 // gets e sets
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}

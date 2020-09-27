package poojava;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampa;
    public void status(){
        System.out.println("Uma caneta de cor: "+ this.cor);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ponta; "+this.ponta);
        System.out.println("Está Tampada?: "+ this.tampa);
        System.out.println("A sua carga: "+ this.carga);
    }
     public void escrever(){
        if(this.tampa == false && this.carga > 0){
            System.out.println("Funcional!");
        }
        else{
            System.out.println("Erro, não posso rabiscar!");
        }
    }
    public void rabiscar(){
        if(this.tampa == false && this.carga > 0){
            System.out.println("Funcional!");
        }
        else{
            System.out.println("Erro, não posso rabiscar!");
        }
    }
    private void tampar(){
        this.tampa = true;
    }
    
    private void destampar(){
        this.tampa = false;
    }
}

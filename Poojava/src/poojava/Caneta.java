package poojava;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;
    void status(){
        System.out.println("Uma caneta de cor: "+ this.cor);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Está Tampada?: "+ this.tampa);
        System.out.println("A sua carga: "+ this.carga);
    }
    void rabiscar(){
        if(this.tampa == false && this.carga > 0){
            System.out.println("Funcional!");
        }
        else{
            System.out.println("Erro, não posso rabiscar!");
        }
    }
    void tampar(){
        this.tampa = true;
    }
    
    void destampar(){
        this.tampa = false;
    }
}

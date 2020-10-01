
package poojava_3;

public class Caneta {
   public String modelo;
   private float ponta;
   public boolean tampa;
   public String cor;
    
   //contrutor
   //quero que a caneta inicie azul e venha tampada
   public Caneta(String m, String c, float p){
       this.modelo = m;
       this.cor = c;
       this.setPonta(p);
       this.cor = "vermelha";
   
   }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampa = true;
    }
    public void destampar(){
        this.tampa = false;
    }
    public void status(){
        System.out.println("O modelo é: "+this.getModelo());
        System.out.println("A ponta é: "+this.getPonta());
        System.out.println("A cor é: "+this.cor);
        System.out.println("Esta tampada ?: "+this.tampa);
    
    }
}


package contribuintes;

import java.time.LocalDate;

public class ContribuinteAutonomo extends Contribuinte{
    private double valorAposentadoria;

    public ContribuinteAutonomo(String nome, String cpf, LocalDate dataAdmissao, boolean status, double taxaContribuicao, double salario) {
        super(nome, cpf, dataAdmissao, status, taxaContribuicao);
    }

    public double getValorAposentadoria() {
        return valorAposentadoria;
    }

    public void setValorAposentadoria(double valorAposentadoria) {
        if (valorAposentadoria < 5000){
            this.valorAposentadoria = valorAposentadoria;
        }
        else{
            System.out.println("Valor maior que 5.000");
        }
    }

    @Override
    public String toString() {
        return "ContribuinteAutonomo{" + "valorAposentadoria=" + valorAposentadoria + '}';
    }
    
    @Override
    public double calcularContribuicaoMensal(){
        //alor da aposentadoria x taxa de contribuição
        double a = this.getValorAposentadoria() * this.getTaxaContribuicao();
        return a;
    }
    
}

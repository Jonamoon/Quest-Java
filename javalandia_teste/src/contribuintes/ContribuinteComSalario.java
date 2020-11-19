
package contribuintes;

import java.time.LocalDate;

public abstract class ContribuinteComSalario extends Contribuinte{
    
    private double salario;
    
    public ContribuinteComSalario(String nome, String cpf, LocalDate dataAdmissao, boolean status, double taxaContribuicao, double salario) {
        super(nome, cpf, dataAdmissao, status, taxaContribuicao);
           
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ContribuinteComSalario{" + "salario=" + salario + '}';
    }
    
    
    
}

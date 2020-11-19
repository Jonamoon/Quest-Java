package contribuintes;

import java.time.LocalDate;

public class ContribuintePublico extends ContribuinteComSalario {

    public ContribuintePublico(String nome, String cpf, LocalDate dataAdmissao, boolean status, double taxaContribuicao, double salario) {
        super(nome, cpf, dataAdmissao, status, taxaContribuicao, salario);
    }
    
    @Override
    public String toString() {
	return getClass().getName() + "@"
              + Integer.toHexString(hashCode());
    }
    
    public void calcularContribuicaoMensal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
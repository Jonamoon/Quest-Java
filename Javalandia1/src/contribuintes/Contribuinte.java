
package contribuintes;

import java.time.LocalDate;

public class Contribuinte {
    public String nome;
    public String cpf;
    public LocalDate dataAdmissao;
    public double taxaContribuicao;
    public boolean status;
    public double salario;
    //contrutor

    public Contribuinte(String nome, String cpf, LocalDate dataAdmissao, double taxaContribuicao, boolean status, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
        this.taxaContribuicao = taxaContribuicao;
        this.status = status;
        this.salario = salario;
    }
    
    
    //métodos
    public double calcularContribuicaoMensal(){
        double contri = this.salario * this.taxaContribuicao;
        //System.out.println("sua Contribuição é:"+contri);
        return contri;
    }
    
    public void imprimirContribuicaoMensal(){
	System.out.print("A contribuição mensal de: "+this.nome+" é: "+calcularContribuicaoMensal()+" R$");	
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getTaxaContribuicao() {
        return taxaContribuicao;
    }

    public void setTaxaContribuicao(double taxaContribuicao) {
        this.taxaContribuicao = taxaContribuicao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}



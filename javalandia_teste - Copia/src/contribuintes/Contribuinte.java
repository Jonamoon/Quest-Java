package contribuintes;

import java.time.LocalDate;

public abstract class Contribuinte {

	private String nome;
	private String cpf;
	private LocalDate dataAdmissao;
	private boolean status;
	private double taxaContribuicao;
	//private double salario;

	public Contribuinte(String nome, String cpf, LocalDate dataAdmissao, boolean status, double taxaContribuicao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataAdmissao = dataAdmissao;
		this.status = status;
		this.taxaContribuicao = taxaContribuicao;
		this.salario = salario;
	}
	
	public abstract double calcularContribuicaoMensal() {
		return this.salario * this.taxaContribuicao;
	}
	
	public void imprimirContribuicaoMensal() {
		System.out.printf("A contribui��o mensal de %s � de R$ %.2f%n", this.nome, calcularContribuicaoMensal());
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getTaxaContribuicao() {
		return taxaContribuicao;
	}

	public void setTaxaContribuicao(double taxaContribuicao) {
		this.taxaContribuicao = taxaContribuicao;
	}

	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", cpf=" + cpf + ", dataAdmissao=" + dataAdmissao + ", status=" + status
				+ ", taxaContribuicao=" + taxaContribuicao + ", salario=" + salario + "]";
	}
	
	

}

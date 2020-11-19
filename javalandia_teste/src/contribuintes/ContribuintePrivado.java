
package contribuintes;

import java.time.LocalDate;

public class ContribuintePrivado extends ContribuinteComSalario {
    public static double valorMaximoAposentadoria = 5.000;

    public ContribuintePrivado(String nome, String cpf, LocalDate dataAdmissao, boolean status, double taxaContribuicao, double salario) {
        super(nome, cpf, dataAdmissao, status, taxaContribuicao, salario);
    }

    public static double getValorMaximoAposentadoria() {
        return valorMaximoAposentadoria;
    }

    public static void setValorMaximoAposentadoria(double valorMaximoAposentadoria) {
        ContribuintePrivado.valorMaximoAposentadoria = valorMaximoAposentadoria;
    }
    
    //método calcularContribuicaoMensal deve ser implementado (se o salário for maior que o valor máximo de aposentadoria, retornar o valor máximo x taxa de contribuição. Caso contrário, retornar salario x taxa de contribuição)
    
}

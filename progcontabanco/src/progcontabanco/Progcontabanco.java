
package progcontabanco;
import java.util.Scanner;
public class Progcontabanco {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setDonoConta("Joãozinho");
        c1.abrirConta("CC");
        
        ContaBanco c2 = new ContaBanco();
        c2.setDonoConta("Josisbalda");
        c2.abrirConta("CP");
        
        //deposito
        c1.depositar(100.0);
        c2.depositar(500.0);
        
        //saque
        c2.sacar(50.0);
        
        // fechar
        c1.fecharConta();
        
        //tirar
        c2.pagarMensal();
        
        //resumo
        System.out.println("----------------------");
        c1.resumoConta();
        c2.resumoConta();
         System.out.println("---------------------");
        
        
//        int cond = 0;
//        ContaBanco c1 = new ContaBanco();
//        
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Ola, bem vindo(a) ao banco Xilito! o que deseja fazer? ");
//        System.out.println("(1) Abrir conta");
//        System.out.println("(2) Depositar na conta");
//        System.out.println("(3) Sacar na conta");
//        System.out.println("(4) Ver saldo da conta");
//        System.out.println("(5) Fechar sua conta :-( ");
//        System.out.println("(6) Cobrar Mensalidade ");
//        System.out.println("(7) Resumo da conta ");
//        System.out.println("(8) Sair! \n");
//        
//        cond = in.nextInt(); 
//        
//            if(cond == 1){
//                System.out.println("Digite o seu tipo de conta: ");
//                System.out.println("CC ou CP");
//              c1.abrirConta(in.nextLine());
//                System.out.println("Digite o seu nome: ");
//
//            }
//            if(cond == 2){
//                System.out.println("Digite o quanto queres depositar: ");
//              c1.depositar(in.nextDouble());
//            }
//            if(cond == 3){
//                System.out.println("Digite o quanto queres Sacar");
//               c1.sacar(in.nextDouble());
//            }
//            if(cond == 4){
//                System.out.println("O seu saldo é:"+c1.getSaldo());
//            }
//            if(cond == 5){
//                c1.fecharConta();
//            }
//            if(cond == 6){
//                c1.pagarMensal();
//            }
//            if(cond == 7){
//                c1.resumoConta();
//            }
//            else{
//                System.out.println("Obrigado por usar!");
//            }
//
//        
//       
    }
    
}

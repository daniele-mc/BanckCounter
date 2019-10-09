import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria contacorrente = new ContaCorrente();
        ContaBancaria containvestimento = new ContaInvestimento();

        int opcao1 =1;
        int opcao2;
 
        double dinheiro = 0.0;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        while ((opcao1 >= 1)&&(opcao1 <=4)){

            System.out.println("\nDigite 1 p/ depositar um valor na conta");
            System.out.println("Digite 2 p/ sacar um valor na conta");
            System.out.println("Digite 3 p/ transferir um valor na conta");
            System.out.println("Digite 4 p/ ver saldo final");
            opcao1 = (sc.nextInt());
            
            switch (opcao1) {

                case 1:
                    System.out.println("Digite 1 p/ fazer depósito na Conta Corrente");
                    System.out.println("Digite 2 p/ fazer depósito na Conta Investimento");
                    opcao2 = (sc.nextInt());
                    if (opcao2 == 1) {
                        System.out.println("Valor p/ depósito: ");
                        dinheiro = sc.nextDouble();
                        contacorrente.depositar(dinheiro);
                    }
                    else if (opcao2 == 2) {
                        System.out.println("Valor p/ depósito: ");
                        dinheiro = sc.nextDouble();
                        containvestimento.depositar(dinheiro);
                    } else {
                        break;
                    }
                    break;

                case 2:
                    System.out.println("Digite 1 p/ fazer saque na Conta Corrente");
                    System.out.println("Digite 2 p/ fazer saque na Conta Investimento");
                    opcao2 = (sc.nextInt());
                    if (opcao2 == 1) {
                        System.out.println("Valor p/ sacar: ");
                        dinheiro = sc.nextDouble();
                        contacorrente.sacar(dinheiro);
                    } else if (opcao2 == 2) {
                        System.out.println("Valor p/ sacar: ");
                        dinheiro = sc.nextDouble();
                        containvestimento.sacar(dinheiro);
                    } else {
                        break;
                    }
                    break;

                case 3:
                    System.out.println("Digite 1 p/ fazer transferencia na Conta Corrente");
                    System.out.println("Digite 2 p/ fazer transferencia na Conta Investimento");
                    opcao2 = (sc.nextInt());
                    if (opcao2 == 1) {
                        System.out.println("Valor p/ transferir: ");
                        dinheiro = sc.nextDouble();
                        contacorrente.transferir(containvestimento, dinheiro);
                    } else if (opcao2 == 2) {
                        System.out.println("Valor p/ transferir: ");
                        dinheiro = sc.nextDouble();
                        containvestimento.transferir(contacorrente, dinheiro);

                    } else {
                        break;
                    }
                    break;

                case 4:
                    System.out.println("Conta corrente: " + contacorrente.getSaldo());
                    System.out.println("Conta investimento: " + containvestimento.getSaldo());
                    break;
                    default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
}


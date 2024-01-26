import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {


        String nomeCliente = "José Augusto da Cunha";
        String tipoConta = "Conta Corrente";
        double saldo = 3200;
        int opcao = 0;
        int decisao = 0;

        System.out.println("""
                ****************************
                                
                Dados iniciais do cliente
                            
                Nome do cliente: %s
                Tipo de conta: %s
                Saldo inicial: R$ %2f
                                
                ****************************
                """.formatted(nomeCliente, tipoConta, saldo)
        );

        String menu = """
                    
                    Operações
                                
                1- Consultar saldos
                2- Transferir valor
                3- Receber valor
                4- Sair
                                
                Digite a opção desejada:
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é de R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir:");
                double valorTransferido = leitura.nextDouble();
                if (valorTransferido > saldo) {
                    System.out.println("Não há saldo suficiente para realizar a transferência!");
                } else{
                    saldo -= valorTransferido;
                    System.out.println("Novo saldo R$" + saldo);
                }
            } else if (opcao == 3){
                System.out.println("Qual valor você esta recebendo:");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Seu saldo atualizado é de R$" + saldo);
            } else if (opcao == 4) {
                System.out.println("Certeza que deseja sair da aplicação ?");
                System.out.println("Digite 1 para SIM  e 2 para NÃO.");
                decisao = leitura.nextInt();
                if (decisao != 1){
                    System.out.println("Você escolheu continuar na aplicação");
                    System.out.println(menu);
                    opcao = leitura.nextInt();
                }
            } else {
                System.out.println("Você escolheu sair da aplicação!");
            }

        }
    }
}



import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ContaBancaria> dados = new ArrayList<ContaBancaria>();
        Scanner leitor = new Scanner(System.in);
        String nome;
        int numero_conta;
        float saldo = 0.0f, valor;
        int opcao, registro = 0, aux = 0;
        boolean status;

        do{
            System.out.printf(" \n-------------------------------- \n");
            System.out.printf("[1] - Cadastrar um novo cliente \n");
            System.out.printf("-------------------------------- \n");
            System.out.printf("[2] - Deposito  \n");
            System.out.printf("[3] - Saque  \n");
            System.out.printf("[4] - Cosultar saldo \n");
            System.out.printf("--------------------------------\n");
            System.out.printf("[5] - Sair \n");
            System.out.printf("--------------------------------\n");
            System.out.printf("Insira o numero de acordo com as opções: ");
            opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    System.out.printf("Informe o numero da conta bancaria: ");
                    numero_conta = Integer.parseInt(leitor.nextLine());
                    for (int i = 0; i < registro; i++){
                        status =  dados.get(i).verificar(numero_conta); 
                         if(status == true){
                             aux = 1;
                             break;
                         }
                     }
                    
                     if(aux == 1){
                        System.out.printf("ERRO... Já existe uma conta com esse numero bancario! \n");
                     }
                     else{
                        System.out.printf("Informe o nome do cliente: ");
                        nome = leitor.nextLine();
                        dados.add(new ContaBancaria(nome, numero_conta, 0));   
                        registro++;
                     }
                     aux = 0;
                break;

                case 2:
                    System.out.printf("Informe o numero da sua conta bancaria: ");
                    numero_conta = Integer.parseInt(leitor.nextLine());

                    System.out.printf("Informe o valor do deposito: ");
                    valor = Float.parseFloat(leitor.nextLine());

                    for (int i = 0; i < registro; i++){
                       status =  dados.get(i).verificar(numero_conta); 
                        if(status == true){
                            saldo = dados.get(i).Depositar(valor);
                            aux = 1;
                            break;
                        }
                    }
                    if (aux != 1){
                        System.out.printf("O numero inserido não corresponde a nenhuma conta! ");
                    }
                    else{
                        System.out.printf("Muito bem! O deposito foi realizado com sucesso.\nSaldo: %.2f", saldo);
                    }
                    aux = 0;
                break;

                case 3:
                    System.out.printf("Informe o numero da sua conta bancaria: ");
                    numero_conta = Integer.parseInt(leitor.nextLine());

                    System.out.printf("Informe o valor do saque: ");
                    valor = Float.parseFloat(leitor.nextLine());

                    for (int i = 0; i < registro; i++){
                        status =  dados.get(i).verificar(numero_conta); 
                        saldo = dados.get(i).Sacar(0); //controlar para a pessoa não tirar um valor que não tem!
                        if(status == true && saldo > valor){
                            saldo = dados.get(i).Sacar(valor);
                            aux = 1;
                            break;
                        }
                    }
                    if (aux != 1){
                        System.out.printf("O numero inserido não corresponde a nenhuma conta ou o valor informado do saque é maior que seu saldo!  \nSaldo atual: %.2f", saldo);
                    }
                    else{
                        System.out.printf("Muito bem! O Saque foi realizado com sucesso.\nSaldo: %.2f", saldo);
                    }
                    aux = 0;
                break;

                case 4:
                    System.out.printf("Informe o numero da sua conta bancaria: ");
                    numero_conta = Integer.parseInt(leitor.nextLine());

                    for (int i = 0; i < registro; i++){
                        status =  dados.get(i).verificar(numero_conta); 
                         if(status == true){
                             saldo = dados.get(i).getSaldo();
                             System.out.printf("\n##############################\n");
                             System.out.printf("Conta: %d\n", numero_conta);
                             System.out.printf("Seu saldo atual: %.2f\n", saldo);
                             System.out.printf("##############################\n");
                             aux = 1;
                             break;
                         }
                     }
                     if (aux != 1){
                        System.out.printf("O numero inserido não corresponde a nenhuma conta!!");
                     }

                break;
            
                default:
                break;
            }










        }while(opcao != 5);

        leitor.close();
    }
    
}
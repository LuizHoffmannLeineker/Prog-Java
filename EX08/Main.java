import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        List<Pizza> sabores = new ArrayList<Pizza>();
        List<Pedido> pedidos = new ArrayList<Pedido>();
        Scanner leitor = new Scanner(System.in);
        String sabor_pizza;
        String tamanho;
        String endereco;
        float valor;
        int opcao, registro = 0, aux = 0;
        float media = 0;
        boolean retorno;

        Pizza sabor1 = new Pizza("Mussarela", "Mussarela & Batata Palha", 20.50f);
        Pizza sabor2 = new Pizza("Frango Catupiry", "Frango, Catupiry, Mussarela & Azeitona", 25.50f);
        Pizza sabor3 = new Pizza("Calabresa", "Calabresa, Mussarela & Milho", 24);
        Pizza sabor4 = new Pizza("Quatro Queijos", "Mussarela, Provolone, Prato & Catupiry", 28 );
        Pizza sabor5 = new Pizza("Tres Estaçóes", "Frango, Calabresa, Presunto, Mussarela & Oregano", 28.99f);
        sabores.add(sabor1);
        sabores.add(sabor2);
        sabores.add(sabor3);
        sabores.add(sabor4);
        sabores.add(sabor5);
        

        do{
            System.out.printf("\nO~i~OO~i~OO~i~OO~i~OO~i~OO~i~OO~i~OO~i~OO~i~O\n");
            System.out.printf("[1] - Registrar Pedido\n");
            System.out.printf("[2] - Cancelar Pedido\n");
            System.out.printf("[3] - Menu de Sabor\n");
            System.out.printf("[4] - Relatório de Todos os Pedidos\n");
            System.out.printf("[5] - Sair\n");
            System.out.printf("O~i~OO~i~OO~i~OO~i~OO~i~OO~i~OO~i~OO~i~OO~i~O\n");

            System.out.printf("Insira um numero de acordo com as opções: ");
            opcao = Integer.parseInt(leitor.nextLine());
            System.out.printf("O~i~OO~i~OO~i~OO~i~OO~i~OO~i~OO~i~OO~i~OO~i~O\n");

            switch (opcao){
                case 1:
                    System.out.printf("Insira o sabor desejado para a pizza: ");
                    sabor_pizza = leitor.nextLine();

                    System.out.printf("Qual é o tamanho da pizza de %s?\nPequena - 5 pedaços\nMedia - 8 pedaços\nGigante - 12 pedaços\nExtraodinaria - 16 pedaços\n", sabor_pizza);
                    tamanho = leitor.nextLine();

                    System.out.printf("Informe o endereço para entrega: ");
                    endereco = leitor.nextLine();

                    for (int i = 0; i < 5; i++) {
                        retorno = sabores.get(i).verificar(sabor_pizza);
                        if(retorno){
                            valor = sabores.get(i).valor_total(tamanho);
                            aux = 1;
                            if(valor == -1){
                                System.out.printf("\nO tamanho inserido não é valido!\n");
                            }
                            else{
                                System.out.printf("\nPedido registrado!\n");
                                pedidos.add(new Pedido(sabor_pizza, tamanho, endereco, valor));
                                registro++;
                            }
                        }
                    }

                    if(aux != 1){
                        System.out.printf("O sabor %s não está registrado em nossa pizzaria! ", sabor_pizza);
                    }
                    aux = 0;
                break;

                case 2:
                    System.out.printf("Para cancelar a entrega informe o endereço: ");
                    endereco = leitor.nextLine();

                    for (int i = 0; i < registro; i++) {
                        retorno = pedidos.get(i).verificar(endereco);
                        if(retorno){
                            System.out.printf("\nPedido cancelado! \n");
                            pedidos.remove(i);
                            registro--;
                            aux = 1;
                        }
                    }

                    if(aux != 1){
                        System.out.printf("\nInfelizmente esse endereço '%s' não tem nenhum pedido registrado!\n", endereco);
                    }
                    aux = 0;
                break;

                case 3:
                    System.out.printf("~~~~~~~~ MENU ~~~~~~~~\n");

                    for (int i = 0; i < 5; i++) {
                        sabores.get(i).menu();
                    }
                    
                break;

                case 4:
                    if(registro > 0){
                        System.out.printf("\nTodos os pedidos feitos: \n");
                        for(int i = 0; i < registro; i++){
                           media = media + pedidos.get(i).relatorio();
                        }
                        media = media / registro;
                        System.out.printf("\nNumero total de pedidos: %d\nMedia de preço: %.2f \n", registro, media);
                        media = 0;
                    }
                    else{
                        System.out.printf("\nNenhum pedido realizado!\n");
                    }
                break;
            
                default:
                break;
            }







            
        }while(opcao != 5);

        leitor.close();
    }
}
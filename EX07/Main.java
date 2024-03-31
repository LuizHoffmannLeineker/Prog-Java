import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        List <Produto> produtos = new ArrayList<Produto>();  
        Scanner leitor = new Scanner(System.in);
        String nome;
        int codigo_produto;
        int quantidade;
        float preco;
        int opcao, registro = 0, aux = 0;
        boolean retorno;



        do{
            System.out.printf("\nO0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O\n");
            System.out.printf("[1] Registrar novo produto\n");
            System.out.printf("[2] Atualizar informação do produto\n");
            System.out.printf("[3] Remover produto\n");
            System.out.printf("[4] Relatorio\n");
            System.out.printf("[5] Sair\n"); // case 4 eu coloca a opcao de filtrar por um especifico ou mostrar tudo, os  dois
            System.out.printf("O0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O0O\n");
            System.out.printf("Informe um numero de acordo com as opções: ");
            opcao = Integer.parseInt(leitor.nextLine());
            System.out.printf("\n");

            switch(opcao) {
                case 1:
                    System.out.printf("Informe o nome do produto que deseja adicionar ao sistema: ");
                    nome = leitor.nextLine();

                    System.out.printf("Qual seria o codigo do produto? ");
                    codigo_produto = Integer.parseInt(leitor.nextLine());

                    System.out.printf("Informe o valor que deseja cobrar neste produto: ");
                    preco = Float.parseFloat(leitor.nextLine());

                    System.out.printf("Qual é quantidade desse produto? ");
                    quantidade = Integer.parseInt(leitor.nextLine());

                    for(int i = 0; i < registro; i++) {
                        retorno = produtos.get(i).verificar(codigo_produto);
                        if(retorno){
                            aux = 1;
                        }    
                    }

                    if(aux == 1){
                        System.out.printf("\nERRO.. Esse codigo de produto ja tem registro no sistema! \n");
                    }
                    else{
                        produtos.add(new Produto(nome, codigo_produto, quantidade, preco));    
                        System.out.printf("\nProduto Registrado com sucesso!\n");    
                        registro++;
                    }
                    aux = 0;
                break;

                case 2:
                    System.out.printf("Informe o codigo do produto para atualizar as informações do sistema: ");
                    codigo_produto = Integer.parseInt(leitor.nextLine());


                    for (int i = 0; i < registro; i++) {
                        retorno = produtos.get(i).verificar(codigo_produto);
                            if(retorno){
                                System.out.printf("Qual informação voce quer atualizar?\n[1] - Preço\n[2] - Estoque\n[3] - Preço & Estoque\n" );
                                opcao = Integer.parseInt(leitor.nextLine());
                                    if(opcao == 1){
                                        System.out.printf("Qual é o valor que deseja atribuir a este produto: ");
                                        preco = Float.parseFloat(leitor.nextLine());
                                        produtos.get(i).atualizar(preco, 0, opcao);  
                                    }
                                    else if(opcao == 2){
                                        System.out.printf("Qual é quantidade total desse produto no estoque:  ");
                                        quantidade = Integer.parseInt(leitor.nextLine());
                                        produtos.get(i).atualizar(0, quantidade, opcao);  
                                    }
                                    else{
                                        System.out.printf("Qual é o valor que deseja atribuir a este produto: ");
                                        preco = Float.parseFloat(leitor.nextLine());

                                        System.out.printf("Qual é quantidade total desse produto no estoque:  ");
                                        quantidade = Integer.parseInt(leitor.nextLine());

                                        produtos.get(i).atualizar(preco, quantidade, opcao);  
                                    }
                                aux++;       
                            }
                    }

                    if(aux != 1){
                      System.out.printf("\nInfelizmente não foi possivel encontrar o produto com esse codigo! \n");  
                    }
                    else{
                      System.out.printf("\nInformações atualizadas!\n");  
                    }
                    aux = 0;
                break;

                case 3:
                    System.out.printf("Informe o codigo do produto para remover as informações do sistema: ");
                    codigo_produto = Integer.parseInt(leitor.nextLine());

                    for (int i = 0; i < registro; i++) {
                        retorno = produtos.get(i).verificar(codigo_produto);
                        if(retorno){
                         produtos.remove(i);
                         aux = 1;
                        }    
                    }
                    if(aux != 1){
                        System.out.printf("\nInfelizmente não foi possivel remover.. o codigo do produto não está no sistema \n");

                    }
                    else{
                        System.out.printf("\nProduto deletado!\n"); 
                        registro--;  
                    }
                    aux = 0;
                break;

                case 4:
                    System.out.printf("\nQual tipo de relatorio voce deseja?\n[1] - Relatorio Geral\n[2] - Filtrar por codigo do produto\n");   
                    opcao = Integer.parseInt(leitor.nextLine());
                    
                    if(opcao == 1){
                        for (int i = 0; i < registro; i++) {
                            produtos.get(i).relatorio();
                        }
                        
                    }
                    
                    else if(opcao == 2){
                        System.out.printf("Insira o codigo: ");  
                        codigo_produto = Integer.parseInt(leitor.nextLine()); 

                        for(int i = 0; i < registro; i++){
                            retorno = produtos.get(i).verificar(codigo_produto);
                            if(retorno){
                                produtos.get(i).relatorio();
                                aux = 1;
                            }    
                        }
                    }
                    if(registro < 1 && opcao == 1){
                        System.out.printf("\nNão tem nenhum produto inserido no sistema!\n");
                    }
                    else if(aux == 0 && opcao == 2){
                        System.out.printf("\nNão foi possivel econtrar um produto com esse codigo!\n");
                    }
                    aux = 0;
                break;
            
                default:
                break;
            }



        }while(opcao != 5);


        leitor.close();
    }
    
    
}
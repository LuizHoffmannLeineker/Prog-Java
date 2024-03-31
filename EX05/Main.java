import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Carro> evento = new ArrayList<Carro>(); 
        String marca;
        String modelo;
        String placa;
        int ano;
        int velocidade_atual;
        int opcao, registro = 0, aux = 0;
        boolean verificacao;

            System.out.printf("Olá amante da velocidade!\n");
        do{
            System.out.printf("\n===========================\n");
            System.out.printf("[1] - Registrar Carro\n");
            System.out.printf("[2] - Alteração na Velocidade\n");
            System.out.printf("[3] - Listar Carro\n");
            System.out.printf("[4] - Sair\n");
            System.out.printf("Insira um numero de acordo com as opções: ");
            opcao = Integer.parseInt(leitor.nextLine());
            
            switch (opcao){
                case 1:
                    System.out.printf("Insira a marca do veiculo: ");
                    marca = leitor.nextLine();

                    System.out.printf("Insira o modelo: ");
                    modelo = leitor.nextLine();

                    System.out.printf("Qual seria a placa? ");
                    placa = leitor.nextLine();

                    System.out.printf("Insira o ano do %s: ", modelo);
                    ano = Integer.parseInt(leitor.nextLine());

                    System.out.printf("Qual seria a velocidade atual desse belíssimo carro? ");
                    velocidade_atual = Integer.parseInt(leitor.nextLine());

                    evento.add(new Carro(marca, modelo, placa, ano, velocidade_atual));

                    registro++;
                break;
            
                case 2:
                    System.out.printf("Informe a placa do carro: ");
                    placa = leitor.nextLine();

                    for (int i = 0; i < registro; i++) {
                        verificacao = evento.get(i).placa_compativel(placa);
                        if(verificacao){
                            System.out.printf("Qual alteração voce quer registrar? \n[1] - Acelerar \n[2] - Freiar\n");
                            opcao = Integer.parseInt(leitor.nextLine());

                            if(opcao == 1){
                                System.out.printf("O Carro ganhou velocidade...\n");
                                evento.get(i).acerelar();
                            }    
                            else{
                                System.out.printf("O Carro perdeu velocidade...\n");
                                evento.get(i).freiar();
                            }
                            aux = 1;
                            break;
                        }

                    }
                    if(aux != 1){
                        System.out.printf("A placa inserida não é valida! \n");
                    }
                    aux = 0;
                break;

                case 3:
                    System.out.printf("Informe a placa do carro: ");
                    placa = leitor.nextLine();

                    for(int i = 0; i < registro; i++){
                        verificacao = evento.get(i).placa_compativel(placa);
                        if(verificacao){
                            evento.get(i).listar();
                            aux = 1;
                            break;
                        }    
                            
                    } 
                    if(aux != 1){
                        System.out.printf("\nNenhum carro é correspondente com a placa inserida!! \n");
                    }   
                            
                break;

                default:
                break;
            }

        }while(opcao != 4);

        leitor.close();
    }
}
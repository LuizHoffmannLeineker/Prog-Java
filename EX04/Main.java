import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        List<Jogador> estatistica = new ArrayList<Jogador>();
        
        Scanner leitor = new Scanner(System.in);
        String nome;
        int pontuacao;
        int nivel;
        int opcao, registro = 0, aux = 0;
        boolean controle;

        do{
            System.out.print("\nXpxPXpxPXpxPXpxPXpxPXpxPXpxPXpxPXpxPXpxP\n");
            System.out.printf("[1] - Inserir novo jogador.\n");
            System.out.printf("[2] - Atualizar informações.\n");
            System.out.printf("[3] - Exibir Informações do Jogador. \n");
            System.out.printf("[4] - Sair. \n");
            System.out.print("XpxPXpxPXpxPXpxPXpxPXpxPXpxPXpxPXpxPXpxP\n");
            System.out.print("\nOlá jogador! Insira um numero de acordo com as opções. \n");
            opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao){
                case 1:
                    System.out.printf("\nSeja bem vindo novo jogador! \n");
                    System.out.printf("Insira o nome: ");
                    nome = leitor.nextLine();
                    
                    System.out.printf("Insira a pontação atual: ");
                    pontuacao = Integer.parseInt(leitor.nextLine());

                    System.out.printf("Insira o nivel: ");
                    nivel = Integer.parseInt(leitor.nextLine());

                     estatistica.add(new Jogador(nome, pontuacao, nivel));
                     registro++;
                break;

                case 2:
                    System.out.printf("\nInforme o seu nome: ");
                    nome = leitor.nextLine();

                    for(int i = 0; i < registro; i++){
                       controle = estatistica.get(i).Verificar(nome);
                        if(controle == true){
                            System.out.printf("Informe o seu nivel atual: ");
                            nivel = Integer.parseInt(leitor.nextLine());
                            estatistica.get(i).setNivel(nivel);

                            System.out.printf("Informe a sua pontuação:  ");
                            pontuacao = Integer.parseInt(leitor.nextLine());
                            estatistica.get(i).setPontuacao(pontuacao);

                            aux = 1;
                            break;
                        }
                    }

                    if(aux != 1 )
                        System.out.printf("Infelizmente este Jogador não está registrado!\n");
                    
                    else
                        System.out.printf("Muito bem %s, voce está evoluindo rapido!\n", nome);

                    aux = 0;
                break;

                case 3:
                    System.out.printf("Para checar a informação do jogador basta inserir o nome: ");
                    nome = leitor.nextLine();

                    for (int i = 0; i < registro; i++) {
                        controle = estatistica.get(i).Verificar(nome);
                        if(controle == true){
                            nivel = estatistica.get(i).getNivel();
                            pontuacao = estatistica.get(i).getPontuacao();
                            System.out.printf("\n Sr. %s, sua conta está nivel: %d\nPotuanção atual: %d \n", nome, nivel, pontuacao);
                            aux = 1;
                            break;
                        }
                    }

                    if(aux != 1){
                        System.out.printf("Infelizmente não foi possivel econtrar um Jogador com o Nome '%s'\n", nome);
                    }
                    
                        
                    
                break;

        
                default:
                break;
            }

        }while(opcao != 4);

        leitor.close();
    }
}
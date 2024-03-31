import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Agenda contato = new Agenda();
        int opcao;
       

        do{
            System.out.printf("\n0~~~0~~~0~~~0~~~0~~~0~~~0~~~0~~~0\n");
            System.out.printf("[1] - Adicionar Contato\n");
            System.out.printf("[2] - Remover Contato\n");
            System.out.printf("[3] - Buscar contato \n");
            System.out.printf("[4] - Sair\n");
            System.out.printf("0~~~0~~~0~~~0~~~0~~~0~~~0~~~0~~~0\n");
            System.out.printf("Insira um numero de acordo com as opções: ");
            opcao = Integer.parseInt(leitor.nextLine());

            switch(opcao){

                case 1:
                    contato.adicionar();
                break;

                case 2:
                   contato.remover();
                break;

                case 3:
                    contato.buscar();
                break;

                default:
                break;

            }

        }while(opcao != 4);
        
        leitor.close();
    }
}
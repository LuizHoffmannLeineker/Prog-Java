import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    List <Contato> contatos = new ArrayList<Contato>();
    String nome;
    String telefone;
    Scanner leitor = new Scanner(System.in);
    int registro = 0, aux = 0;
    boolean retorno;


   void adicionar(){
    System.out.printf("Insira o nome: ");
    nome = leitor.nextLine();

    System.out.printf("Informe o telefone: ");
    telefone = leitor.nextLine();
    
    contatos.add(new Contato(nome, telefone));
    registro++;
   }

   void remover(){
        System.out.printf("\nInsira o nome do registro que deseja excluir:  ");
        nome = leitor.nextLine();

        for(int i = 0; i <  registro; i++){
            retorno =  contatos.get(i).verificar(nome);
            if(retorno){
                contatos.remove(i);
                System.out.printf("O contanto foi removido da lista! \n");
                aux = 1;
                registro--;
                break;
            }
         }

         if(aux != 1){
            System.out.printf("Infelizmente esse nome não está em nossa agenda de contatos!\n");
        }
        aux = 0;

   }
   
   void buscar(){
    System.out.printf("\nInsira o nome do contato: ");
    nome = leitor.nextLine();
    for (int i = 0; i <  registro; i++){
        retorno =  contatos.get(i).verificar(nome);
        if(retorno){
            System.out.printf("O numero do Sr(a) seria: ");
            contatos.get(i).listar();
            aux = 1;
        }
    }
    if(aux != 1){
        System.out.printf("Nome invalido! \n");
    }
   }

}

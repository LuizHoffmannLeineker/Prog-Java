import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<Livro>();
        Scanner leitor = new Scanner(System.in);
        String titulo;
        String autor;
        int ano, opcao;
        int aux = 0;

        do{

        
        System.out.printf("Informe o titulo do livro: ");
        titulo = leitor.nextLine();

        System.out.printf("Qual é o nome do autor? ");
        autor = leitor.nextLine();

        System.out.printf("Qual ano que o livre foi lançado? ");
        ano = Integer.parseInt(leitor.nextLine());


        System.out.printf("Deseja inserir mais algum livro?  \n[1] - Sim  \n[2] - Não \n");
        opcao =  Integer.parseInt(leitor.nextLine());    

         livros.add(new Livro(titulo, autor, ano));   
         

         

         aux++;

        }while(opcao != 2);    

        System.out.printf("\nDeseja filtar por algum titulo de um livro especifico ou deseja listar todos? \n[1] - Filtrar por titulo \n[2] - Listar todos\n");
        opcao =  Integer.parseInt(leitor.nextLine());       
        if(opcao == 1){
            System.out.printf("Qual titulo voce deseja econtrar? "); 
            titulo = leitor.nextLine();
            for (int i = 0; i < aux; i++){
                livros.get(i).exibirInfo(titulo, true); 
            }
            
        }   

        if(opcao == 2){
            for(int i = 0; i < aux; i++){
                livros.get(i).exibirInfo(titulo, false); 
            }
        }
        

        leitor.close();
    }
    
}
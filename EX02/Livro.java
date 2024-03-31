public class Livro {
    String titulo;
    String autor;
    int ano;




    Livro(String titulo_main, String autor_main, int ano_main){
        titulo = titulo_main;
        autor = autor_main;
        ano = ano_main;
    }    

    void exibirInfo(String titulo_especifico, boolean filtar){
        if (filtar){
            if(titulo_especifico.equals(titulo)){
                System.out.printf("\n###################################\n");
                System.out.printf("Titulo: %s \n", titulo);
                System.out.printf("Autor: %s \n", autor);
                System.out.printf("Ano de publicação: %d \n", ano);
            }
        }
        else{
            System.out.printf("\n###################################\n");
            System.out.printf("Titulo: %s \n", titulo);
            System.out.printf("Autor: %s \n", autor);
            System.out.printf("Ano de publicação: %d \n", ano);
        }    
        
    }; 
}




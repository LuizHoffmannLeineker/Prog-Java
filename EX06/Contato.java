public class Contato {
    String  nome;
    String  telefone;

    Contato(String name,String number){
        nome = name;
        telefone = number;
    }

    
    boolean verificar(String nome_verificar){
        if(nome.equals(nome_verificar)){
            return  true;
        }
        else{
            return  false;
        }
    };


    void listar(){
        System.out.printf("%s", telefone);

    }

}

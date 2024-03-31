public class Pedido {
    String sabor_pizza;
    String tamanho;
    String endereco;
    float valor;

    Pedido(String sabor_main, String tamanho_main, String endereco_main, float valor_main){
        sabor_pizza = sabor_main;
        tamanho = tamanho_main;
        endereco = endereco_main;
        valor = valor_main;
    }

    boolean verificar(String endereco_verificar){
        if(endereco.equals(endereco_verificar))
            return true;    
        
        else
            return false;
    }

    float relatorio(){
        System.out.printf("Sabor: %s\nTamanho: %s\nEndereço: %s\nValor Total: %.2f\n\n", sabor_pizza, tamanho, endereco, valor);
        return valor;
    }

}

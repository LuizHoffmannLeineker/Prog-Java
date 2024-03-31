public class Pizza {
    String sabor;
    String ingredientes;
    float valor;

    Pizza(String sabor_main, String ingredientes_main, float valor_final){
        sabor = sabor_main;
        ingredientes = ingredientes_main;
        valor = valor_final;

    };


    boolean verificar(String sabor_verificar){
        if(sabor.equals(sabor_verificar))
            return true;    
        
        else
            return false;
    }

    float valor_total(String tamanho){
        if(tamanho.equals("Pequena"))
        return valor;

        else if(tamanho.equals("Media"))
        return valor + 13.50f;

        else if(tamanho.equals("Gigante"))
        return valor + 19.99f;

        else if(tamanho.equals("Extraodinaria"))
        return valor + 26.30f;
        
        else
        return -1;

    }

    void menu(){
        System.out.printf("%s --------- valor(pizza pequena): %.2f\nIngredientes: %s\n\n", sabor, valor, ingredientes);
    }
}

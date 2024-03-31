public class Produto {
    String nome;
    int codigo_produto;
    int quantidade;
    float preco;

    Produto(String nome_main, int codigo, int quant, float valor){
        nome = nome_main;
        codigo_produto = codigo;
        quantidade = quant;
        preco = valor;
    }


    boolean verificar(int codigo_verificar){
        if(codigo_verificar == codigo_produto)
        return true;
        
        else
            return false;
        
    }

    void atualizar(float preco_atual, int quantidade_atual, int opcode){
        if(opcode == 1)
        preco = preco_atual;
        
        else if(opcode == 2)
        quantidade = quantidade_atual;
        
        else{
            preco = preco_atual;
            quantidade = quantidade_atual;
        }
    }

    void relatorio(){
        System.out.printf("\n############################\n");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Codigo: %d\n", codigo_produto);
        System.out.printf("Preço: %.2f\n", preco);
        System.out.printf("Quantidade em estoque: %d\n", quantidade);
        System.out.printf("############################\n");
        
    }

}

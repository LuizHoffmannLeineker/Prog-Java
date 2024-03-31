public class Carro {
    public String marca;
    public String modelo;
    public String placa;
    public int ano;
    private int velocidade_atual;



    Carro(String marca_main, String modelo_main, String placa_main, int ano_main, int velocidade){
        placa = placa_main;
        marca = marca_main;
        modelo = modelo_main;
        ano = ano_main;
        velocidade_atual = velocidade;
    }

    boolean placa_compativel(String placa_verificar){
        if(placa_verificar.equals(placa)){
            return true;
        }
        else{
            return false;
        }
    }


    void acerelar(){
        velocidade_atual = velocidade_atual + 1;
    }

    void freiar(){
        if(velocidade_atual >= 0)
            velocidade_atual = velocidade_atual - 3;    
        else
            System.out.printf("Esse carro está parado... o veiculo está a %d KM", velocidade_atual);
        
    }

    void listar(){
        System.out.printf("\n===========================\n");
        System.out.printf("Carro de Placa %s\n", placa);
        System.out.printf("===========================\n");
        System.out.printf("Marca: %s\nModelo: %s\nano: %d\nvelocidade atual: %d km/h\n", marca, modelo, ano, velocidade_atual);
        System.out.printf("===========================\n");
        System.out.printf("\n");
        System.out.printf("\\_______________/  \n");
        System.out.printf("__/_\\________/_\\__   \n");
        System.out.printf("/Oo __________ oO\\    \n");
        System.out.printf("|__/__________\\ __|  \n");
        System.out.printf("\\_O_|_|_|_|_|_|_O_/  \n");
    }


}

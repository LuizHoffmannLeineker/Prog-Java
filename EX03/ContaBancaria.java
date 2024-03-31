public class ContaBancaria {
    private String nome;
    private int numero_conta;
    private float saldo;
    
    ContaBancaria(String nome_main, int numero_main, float saldo_main){
        nome = nome_main;
        numero_conta = numero_main;
        saldo = saldo_main;
    }

    /*  setSaldo(float valor){
        saldo = saldo - valor; } */ 

    boolean verificar(int numero_valido){
        if (numero_conta == numero_valido) {
            return true;
        }
        else{
            return false;
        }
    }

    float Sacar(float valor){
        saldo = saldo - valor;
        return saldo;
    }

    float Depositar(float valor){
        saldo = saldo + valor;
        return saldo;
    }

    float getSaldo() {
        return saldo;
    }


}

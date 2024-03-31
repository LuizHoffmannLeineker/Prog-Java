import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String operacao;
        float num1;
        float num2;
        float retorno;
    

        System.out.printf("Informe o Primeiro Numero: ");
        num1 = Float.parseFloat(leitor.nextLine());
    
        System.out.printf("Insira o simbolo da operação: ");
        operacao = leitor.nextLine();
    
        System.out.printf("Informe o Segundo Numero: ");
        num2 = Float.parseFloat(leitor.nextLine());
    
    
        
    
        retorno = Calculadora.ULA(operacao, num1, num2);

        if(retorno == -1){
            System.out.printf("Operação invalida! Tente novamente..");
        }
        else{
        System.out.printf("Resultado: %.2f", retorno);
        }

        leitor.close();
    
      
    }

}
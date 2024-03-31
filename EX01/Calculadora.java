public class Calculadora {
    
  
    
    static float ULA(String operacao, float num1, float num2){
      float resultado;
      switch (operacao) {
  
        case "+":
            resultado = num1 + num2;    
        break;
  
        case "-":
            resultado = num1 - num2;   
        break;
  
        case "*":
            resultado = num1 * num2;   
        break;
  
        case "/":
            if(num2 == 0){
                return Float.NaN;
            }
            resultado = num1 / num2;
  
        break;
  
        default:
        return -1;
          
      }
  
      return resultado;
  
    
    }
  
  
}
/*
 @author Brandon Samayoa
*/
public class mainOne {
    public static void main(String[] args) {
      
     Calculadora calculadora;
      
     calculadora = new Calculadora(8f,6f);

     System.out.println(calculadora.multiplicarOperandos());  
     System.out.println(calculadora.restarOperandos());
     System.out.println(calculadora.dividirOperandos());
     System.out.println(calculadora.sumarOperandos());
     Calculator calculator;
      
     calculator = new Calculator(8f,6f);
     System.out.println(calculator.restoDividirOperandos()); 
     System.out.println(calculator.multiplicarOperandos());
     System.out.println(calculator.dividirOperandos());
     System.out.println(calculator.sumarOperandos());
     System.out.println(calculator.restarOperandos());
     
     Complex cb1 = new Complex(3f,4f); 
     Complex cb3; 
     Complex1 bb;
     Complex cb2 = new Complex(3f,3f);  
     bb =
     new Complex1(0,0,cb1,cb2);

     cb3 = bb.sumaComplejo();
      
     System.out.println("Lo que se obtuvo es esto: "+cb3.getReal()+"+"+
   cb3.getImaginary()+"i"); 
   
    }
   
   } 

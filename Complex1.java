public class Complex1 extends Calculator{ 
 
     Complex cb1; 
     Complex cb2;
     
    //constructor
    public Complex1(float n1,float n2, Complex cb1, Complex cb2){
     super(n1, n2);
     this.cb2 = cb2; 
     this.cb1 = cb1;
     
    }
      
    //suma 
    public Complex sumaComplejo(){ 
     Complex resultado = new Complex();
     
     resultado.setImaginary(this.cb1.getImaginary()+this.cb2.getImaginary());

     resultado.setReal(this.cb1.getReal()+this.cb2.getReal());
    

        
     return resultado;
    } 
   
   } 
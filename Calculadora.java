public class Calculadora {
    protected float n1;
    protected float n2; 
     
//contstructor
    public Calculadora(float n1, float n2){ 
     this.n1 = n1;
     this.n2 = n2;   
    }
     
   //parametros
    public void cargarOperandos(float n1, float n2){
     this.n1 = n1;
     this.n2 = n2;   
    }
     
    //suma
    public float sumarOperandos(){
     return (this.n1+this.n2); 
    }
     
  //resta
    public float restarOperandos(){
     return (
   this.n1-this.n2); 
    }
     
//multiplicacion
    public float multiplicarOperandos(){
     return (this.n1*this.n2); 
    }
     
 //Divivsion
    public float dividirOperandos(){
     float resultado = 0; 
     
     if(this.n2==0){ 
      System.out.println("Error matemático");
     }else{
      resultado = this.n1/this.n2; 
     }
      
     return resultado; 
    }
   } 
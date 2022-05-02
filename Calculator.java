public class Calculator extends Calculadora {

    //Constructor
    public Calculator(float n1, float n2) {
        super(n1, n2);
    }

    //Division
    public float restoDividirOperandos() {
        float res = 0;
        if (this.n2 == 0) {
            System.out.println("Se produjo un error matematico");
        } else {
            res = this.n1 % this.n2;
        }
        return res;
    }
}

public class Complex {
    private float real;
    private float imaginary;
//constructor
    public Complex (float r, float i){
        this.real = r;
        this.imaginary = i;
    }

    //the real part
    public float getReal() {
        return this.real;
    }
//Consttructor
    public Complex (){
        this.real = 0;
        this.imaginary = 0;
    }

//this modifys the real part
    public void setReal(float newR) {
        this.real = newR;
    }
 //This modifys the imaginary part
    public void setImaginary(float newI) {
        this.imaginary = newI;
    }
//Imaginary part
    public float getImaginary() {
        return this.imaginary;
    }
}

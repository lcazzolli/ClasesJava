public class Triangulo extends FiguraGeometrica{

    double base,altura;
    public Triangulo(double b,double a){
        this.base=b;
        this.altura=a;
    }

    @Override
    public double area(){
        return (this.base*this.altura)/2;
    }
}

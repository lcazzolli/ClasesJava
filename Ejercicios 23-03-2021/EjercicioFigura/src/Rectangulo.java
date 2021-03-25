public class Rectangulo extends FiguraGeometrica {
    double base,altura;

    public Rectangulo(double b,double a){
        this.base=b;
        this.altura=a;
    }

    @Override
    public double area(){
        return this.base*this.altura;
    }

}

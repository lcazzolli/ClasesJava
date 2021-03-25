public class Circulo extends FiguraGeometrica{
    double radio;
    public Circulo(double r){
        this.radio=r;
    }

    @Override
    public double area(){
        return Math.PI*Math.pow(this.radio,2);
    }
}

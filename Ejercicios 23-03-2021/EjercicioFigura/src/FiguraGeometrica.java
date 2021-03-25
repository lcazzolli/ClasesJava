public abstract class FiguraGeometrica  {
    public abstract double area();

    @Override
    public String toString(){

        return "";
    }


    public void imprimirArea(){
        System.out.println("el area es" + area());
    }
}

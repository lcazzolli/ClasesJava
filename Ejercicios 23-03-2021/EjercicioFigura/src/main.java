public class main {

    public static void main(String args[]) {

        FiguraGeometrica arr[] =  new FiguraGeometrica[3];
        arr[0] = new Circulo(1);
        arr[1] = new Rectangulo(1,5);
        arr[2] = new Triangulo(3,6);

        double ap = CalculosUtil.areaPromedio(arr);
        System.out.println(ap);
    }
}

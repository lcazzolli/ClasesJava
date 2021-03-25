package EjercioPass;

public class main {

    public static void main(String args[]) {

        Password pswSimple = new PasswordSimple();
        pswSimple.setValue("pedrito");

        Password pswIntermedia = new PasswordIntermedia();
        pswIntermedia.setValue("mercadolibre--");

        Password pswFuerte = new PasswordFuerte();
        pswFuerte.setValue("mercadolibre---");
    }


}

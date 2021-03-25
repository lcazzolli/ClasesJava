package EjercioPass;

public class PasswordFuerte extends Password{
    public PasswordFuerte() {
        super("--");
    }

    @Override
    public void setValue(String pwd) {
        try{
            System.out.println("Fuerte");
            super.setValue(pwd);
        }catch (Exception ex){
            ex.getMessage();
        }
    }
}

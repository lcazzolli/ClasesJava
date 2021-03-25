package EjercioPass;

public class PasswordSimple extends Password {


    public PasswordSimple() {
        super("--");
    }

    @Override
    public void setValue(String pwd) {
        try{
            System.out.println("simple");
            super.setValue(pwd);

        }catch (Exception ex){
            ex.getMessage();
        }
    }


}

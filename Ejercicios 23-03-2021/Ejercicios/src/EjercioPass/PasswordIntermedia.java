package EjercioPass;

public class PasswordIntermedia extends Password{

    public PasswordIntermedia() {
        super("-----");
    }

    @Override
    public void setValue(String pws) {
        try{
            System.out.println("intermedia");
            super.setValue(pws);
        }catch (Exception ex){
            ex.getMessage();
        }
    }
}

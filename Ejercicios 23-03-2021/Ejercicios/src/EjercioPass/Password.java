package EjercioPass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {


    String password, pattern;

    public void setPattern(String pattern) { this.pattern = pattern; }

    public String getPattern() {  return pattern;}

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public Password(String regular){
        this.pattern=regular;
        Pattern.compile(this.pattern);
    }

    public void setValue(String pwd){
        Pattern pattern = Pattern.compile(this.pattern);
        Matcher matcher = pattern.matcher(pwd);
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Acceso habilitado");
            this.password=pwd;
        }else{
            System.out.println("Acceso Denegado");
            throw new IllegalArgumentException();
        }
    }
}

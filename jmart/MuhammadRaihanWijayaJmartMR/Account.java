package MuhammadRaihanWijayaJmartMR;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account extends Recognizable implements FileParser
{
    public static final String REGEX_EMAIL = "^\\w+([.&`~-]?\\w+)*@\\w+([.-]?\\w+)+$", REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d][^-\\s]{8,}$";
    public String name, email, password;
    
    public Account(int id, String name, String email, String password){
        super(id);
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    @Override
    public boolean read(String content){
        return false;
    }
    
    public String toString(){
        return this.name + this.email + this.password;
    }
    
    public boolean validate(){
        Pattern patternEmail = Pattern.compile(REGEX_EMAIL);
        Matcher matcherEmail = patternEmail.matcher(email);
        boolean matchEmail = matcherEmail.find();
        boolean hasilEmail = matchEmail ? true : false;
        
        Pattern patternPassword = Pattern.compile(REGEX_PASSWORD);
        Matcher matcherPassword = patternPassword.matcher(password);
        boolean matchPassword = matcherPassword.find();
        boolean hasilPassword = matchPassword ? true : false;

        if (hasilEmail == true && hasilPassword == true){
            return true;
        }
        else
            return false;
    }
}

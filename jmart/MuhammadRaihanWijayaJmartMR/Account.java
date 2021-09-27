package MuhammadRaihanWijayaJmartMR;

public class Account extends Recognizable implements FileParser
{
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
}

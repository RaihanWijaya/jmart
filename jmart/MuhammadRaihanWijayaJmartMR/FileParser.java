package MuhammadRaihanWijayaJmartMR;

public interface FileParser
{
    public abstract boolean read(String content);
    
    default Object write(){
        return null;
    }
    
    static Object newInstance(String content){
        return null;
    }
}
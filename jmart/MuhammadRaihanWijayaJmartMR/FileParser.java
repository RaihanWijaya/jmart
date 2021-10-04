package MuhammadRaihanWijayaJmartMR;
/**
 * Class for File Parser
 *
 * @author Raihan Wijaya
 * @version v1.0 in Modul 4
 */
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

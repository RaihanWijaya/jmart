package MuhammadRaihanWijayaJmartMR;
/**
 * Class for Transactor
 *
 * @author Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public interface Transactor
{
    public abstract boolean validate();
    
    public abstract Invoice perform();
}
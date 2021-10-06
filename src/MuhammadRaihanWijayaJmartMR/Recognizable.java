package MuhammadRaihanWijayaJmartMR;
/**
 * Class for Recognizable
 *
 * @author Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public abstract class Recognizable
{
    public int id;
    
    protected Recognizable(int id){
        this.id = id;
    }
    
    public boolean equals(Object objek){
        if (objek instanceof Recognizable){
            Recognizable upcasting = (Recognizable)objek;
            if (upcasting.id == id){
                return true;
            }
        }
        return false;
    }
    
    public boolean equals(Recognizable recognize){
        if (
        id == recognize.id){
            return true;
        }
        else{
            return false;
        }
    }
}

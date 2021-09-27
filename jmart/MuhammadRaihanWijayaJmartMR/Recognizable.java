package MuhammadRaihanWijayaJmartMR;

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
    
    //Masih ragu-ragu
    public boolean equals(Recognizable recognize){
        if (this.id == recognize.id){
            return true;
        }
        else{
            return false;
        }
    }
}

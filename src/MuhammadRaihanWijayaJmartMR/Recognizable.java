package MuhammadRaihanWijayaJmartMR;
/**
 * Class for Recognizable
 *
 * @author Muhammad Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public abstract class Recognizable implements Comparable<Recognizable>
{
    public final int id;
    
    protected Recognizable(){
        this.id = 69;
    }

    @Override
    public int compareTo(Recognizable other) {
        if (id == other.id){
            return 1;
        }
        else{
            return 0;
        }
    }

    public boolean equals(Object other){
        return other instanceof Recognizable && ((Recognizable) other).id == id;
    }

    public boolean equals(Recognizable other){
        return other.id == id;
    }

    public static int getClosingId(Class<Recognizable>clazz){
        return 0;
    }

    public static int setClosingId(Class<Recognizable>clazz, int id){
        return 0;
    }
}

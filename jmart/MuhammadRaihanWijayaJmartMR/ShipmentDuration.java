package MuhammadRaihanWijayaJmartMR;

public class ShipmentDuration
{
    public static final ShipmentDuration INSTANT = new ShipmentDuration(1 << 0); //0000 0001
    public static final ShipmentDuration SAME_DAY = new ShipmentDuration(1 << 1); //0000 0010
    public static final ShipmentDuration NEXT_DAY = new ShipmentDuration(1 << 2); //0000 0100
    public static final ShipmentDuration REGULER = new ShipmentDuration(1 << 3); //0000 1000
    public static final ShipmentDuration KARGO = new ShipmentDuration(1 << 4); //0001 0000
    private int bit;
    
    private ShipmentDuration(int bit){
        this.bit = bit;
    }
    
    public ShipmentDuration(int... args){
        for (int i : args){
            this.bit = bit | i;
        }
    }
    
    public boolean isDuration(ShipmentDuration reference){
        if ((reference.bit & this.bit) != 0){
            return true;
        }
        else{
            return false;
        }
    }
}
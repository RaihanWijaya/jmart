package MuhammadRaihanWijayaJmartMR;

public class ShipmentDuration
{
    public static final ShipmentDuration INSTANT = new ShipmentDuration(1 << 0);
    public static final ShipmentDuration SAME_DAY = new ShipmentDuration(1 << 1);
    public static final ShipmentDuration NEXT_DAY = new ShipmentDuration(1 << 2);
    public static final ShipmentDuration REGULER = new ShipmentDuration(1 << 3);
    public static final ShipmentDuration KARGO = new ShipmentDuration(1 << 4);
    private int bit;
    
    private ShipmentDuration(int bit){
        this.bit = bit;
    }
    
    public ShipmentDuration(ShipmentDuration... args){
        //Belum kak :D
    }
    
    public boolean isDuration(ShipmentDuration reference){
        /*switch(reference){
            case ShipmentDuration.INSTANT:
                return true;
            case ShipmentDuration.SAME_DAY:
                return true;
            case ShipmentDuration.NEXT_DAY:
                return true;
            case ShipmentDuration.REGULER:
                return true;
            case ShipmentDuration.KARGO:
                return true;
        }*///Ini juga belum kak :D
        return true;
    }
}
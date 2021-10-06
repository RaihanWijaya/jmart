package MuhammadRaihanWijayaJmartMR;
/**
 * Class for Coupon
 *
 * @author Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public class Coupon extends Recognizable implements FileParser
{
    public static enum Type{
        DISCOUNT,
        REBATE
    }
    public final String name;
    public final int code;
    public final double cut, minimum;
    public final Type type;
    private boolean used;

    public Coupon(int id, String name, int code, Type type, double cut, double minimum){
        super(id);
        this.name = name;
        this.code = code;
        this.cut = cut;
        this.type = type;
        this.minimum = minimum;
        used = false;
    }

    public boolean isUsed(){
        return this.used;
    }
    
    public boolean canApply(PriceTag priceTag){
        if (priceTag.getAdjustedPrice() >= minimum && used == false){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double apply(PriceTag priceTag){
        this.used = true;
        switch (type){
            case DISCOUNT:
                return (priceTag.getAdjustedPrice() * ((100 - cut) / 100));
                
            default:
                return (priceTag.getAdjustedPrice() - cut);
        }
    }
    
    @Override
    public boolean read(String content){
        return false;
    }
}
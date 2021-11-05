package MuhammadRaihanWijayaJmartMR;
/**
 * Class for Coupon
 *
 * @author Muhammad Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public class Coupon extends Recognizable
{
    public final int code;
    public final double cut, minimum;
    public final String name;
    public final Type type;
    private boolean used;

    public Coupon(String name, int code, Type type, double cut, double minimum){
        this.name = name;
        this.code = code;
        this.type = type;
        this.cut = cut;
        this.minimum = minimum;
        used = false;
    }

    public double apply(Treasury treasury){
        this.used = true;
        if (type == Type.DISCOUNT) {
            return (Treasury.getAdjustedPrice(treasury.price, treasury.discount) * ((100 - cut) / 100));
        }
        return (Treasury.getAdjustedPrice(treasury.price, treasury.discount) - cut);
    }
    
    public boolean canApply(Treasury treasury){
        if (Treasury.getAdjustedPrice(treasury.price, treasury.discount) >= minimum && !used){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isUsed(){
        return this.used;
    }

    public static enum Type{
        DISCOUNT,
        REBATE
    }
}
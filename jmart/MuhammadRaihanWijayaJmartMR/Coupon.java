package MuhammadRaihanWijayaJmartMR;

public class Coupon
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

    public Coupon(String name, int code, Type type, double cut, double minimum)
    {
        this.name = name;
        this.code = code;
        this.type = type;
        this.cut = cut;
        this.minimum = minimum;
        this.used = false;
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
        double tempPrice = priceTag.getAdjustedPrice();
        this.used = true;
        switch (type){
            case DISCOUNT:
                return (priceTag.getAdjustedPrice() * ((100 - cut) / 100));
                
            default:
                return (priceTag.getAdjustedPrice() - cut);
        }
    }
}
package MuhammadRaihanWijayaJmartMR;


/**
 * Write a description of class Jmart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jmart
{
    public static void main(String[] args){
        
    }
    //Method getPromo
    public static void getPromo(){
        return 0;
    }
    //Method getCustomer
    public static String getCustomer(){
        return "oop";
    }
    //Method getDiscountPercentage
    public static float getDiscountPercentage(int before, int after){
        if(before < after){
            return 0;//no discount
        }
        else{
            return 0.0f;
        }
    }
    //Method getDiscountedPrice
    public static int getDiscountedPrice(int price, float discountPercentage){
        if(discountPercentage >= 100.0f){
            return 0;
        }
        else if(price == 0){
            return 0;
        }
        else{
            price = price - ((price * discountPercentage) / 100);
        }                
    }
    //Method getOriginalPrice
    public static int getOriginalPrice(int discountedPrice, float discountPercentage){
        int originalPrice;
        if(discountPercentage <= 0){
            return 0;
        }
        else{
            originalPrice = discountedPrice / (1 - discountPercentage);
            return originalPrice;
        }
    }
    //Method getCommissionMultiplier
    public static float getCommissionMultiplier(){
        return 0.05f;
    }
    //Method getAdjustedPrice
    public static int getAdjustedPrice(int price){
        if(price == 0){
            return 0;
        }
        else{
            price = price + ((price * 5) / 100);
        }
    }
    //Method getAdminFee
    public static int getAdminFee(int price){
        int komisi;
        if(price == 0){
            return 0;
        }
        else{
            komisi = (price * 5) / 100;
        }
    }
}

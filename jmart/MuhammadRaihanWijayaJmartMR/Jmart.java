package MuhammadRaihanWijayaJmartMR;

public class Jmart
{
    public static void main(String[] args){
        //Code call function
    }
    
    public static Product create(){
        //PriceTag harga = new PriceTag(700);
        Product LaptopHP = new Product("Laptop HP", 3, false, new PriceTag(700), ProductCategory.GAMING);
        return null;
    }
    /*
     * Ini untuk CS Modul 1
    public static void main(String[] args){
        //Code call function
    }
    //Method getPromo
    public static int getPromo(){
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
            return 100.0f * (before - after) / before;
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
            float tempPrice = price;
            tempPrice = tempPrice - ((tempPrice * discountPercentage) / 100);
            price = (int) tempPrice;
            return price;
        }
    }
    //Method getOriginalPrice
    public static int getOriginalPrice(int discountedPrice, float discountPercentage){
        float divider = 100.0f - discountPercentage;
        
        if(discountPercentage <= 0){
            return 0;
        }
        else{
            return (int) (100 * discountedPrice / divider);
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
            return price;
        }
    }
    //Method getAdminFee
    public static int getAdminFee(int price){
        float comission;
        if(price == 0){
            return 0;
        }
        else{
            comission = (price * 5) / 100;
            int finalComission = (int) comission;
            return finalComission;
        }
    }*/
}
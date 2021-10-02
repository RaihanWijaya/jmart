package MuhammadRaihanWijayaJmartMR;

import java.util.ArrayList;

public class Filter
{
    public static ArrayList<PriceTag> filterPriceTag(PriceTag[] list, double value, boolean less){
        ArrayList<PriceTag> arrayPriceTag = new ArrayList<>();
        
        if (less == true){
            for(PriceTag i : list){
                if (less == true){
                    if (i.getAdjustedPrice() < value){
                        arrayPriceTag.add(i);
                    }
                }
                else{
                    if (i.getAdjustedPrice() >= value){
                        arrayPriceTag.add(i);
                    }
                }
            }
        }
        return arrayPriceTag;
    }
    
    public static void filterProductRating(ArrayList<ProductRating> list, double value, boolean less){
        for(ProductRating i : list){
            if (less == true){
                if (i.getAverage() < value){
                    list.remove(i);
                }
            }
            else{
                if (i.getAverage() >= value){
                    list.remove(i);
                }
            }
        }
    }
}

package MuhammadRaihanWijayaJmartMR;
/**
 * Class for Product Rating
 * 
 * @author Muhammad Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public class ProductRating
{
    private static long total;
    private static long count;
    
    public ProductRating(){
        ProductRating.total = 0;
        ProductRating.count = 0;
    }

    public double getAverage(){
        if (count <= 0){
            System.out.println("Please add rating");
            return 0;
        }
        else{
            return total / count;
        }
    }
    
    public long getCount(){
        return count;
    }
    
    public long getTotal(){
        return total;
    }

    public void insert(int rating){
        total += rating;
        count++;
    }
}

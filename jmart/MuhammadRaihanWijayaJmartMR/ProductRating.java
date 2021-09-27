package MuhammadRaihanWijayaJmartMR;

public class ProductRating
{
    private static long total;
    private static long count;
    
    public ProductRating(){
        ProductRating.total = 0;
        ProductRating.count = 0;
    }
    
    public void insert(int rating){
        total += rating;
        count++;
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
}

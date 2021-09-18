package MuhammadRaihanWijayaJmartMR;

public class ProductRating
{
    private static long total;
    private static long count;
    
    public ProductRating(){
        this.total = 0;
        this.count = 0;
    }
    
    public void insert(int rating){
        total += rating;
        count++;
    }
    
    public double getAverage(){
        if(count <= 0){
            System.out.println("Please add rating");
            return 0;
        }
        else{
            return (double) total / count;
        }
    }
    
    public long getCount(){
        return count;
    }
    
    public long getTotal(){
        return total;
    }
}
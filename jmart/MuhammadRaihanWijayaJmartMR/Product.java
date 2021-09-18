package MuhammadRaihanWijayaJmartMR;

public class Product
{
    // instance variables - replace the example below with your own
    private static int idCounter = 0;
    public int id, weight;
    public String name;
    public boolean conditionUsed;
    public PriceTag priceTag;
    public ProductCategory category;
    public ProductRating rating;

    public Product(String name, int weight, boolean conditionUsed, PriceTag priceTag,
    ProductCategory category)
    {
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.priceTag = priceTag;
        this.category = category;
        ProductRating rating = new ProductRating();
        id = idCounter;
        idCounter++;
    }
}

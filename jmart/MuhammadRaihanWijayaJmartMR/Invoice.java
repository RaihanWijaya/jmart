package MuhammadRaihanWijayaJmartMR;

import java.util.Date;

public abstract class Invoice extends Recognizable implements FileParser
{
    public Date date;
    public int buyerId;
    public int productId;
    public int complaintId;
    public Rating rating;
    public Status status;
    
    public static enum Status{
        WAITING_CONFIRMATION,
        CANCELLED,
        ON_PROGRESS,
        ON_DELIVERY,
        COMPLAINT,
        FINISHED,
        FAILED
    }
    
    public static enum Rating{
        NONE, 
        BAD, 
        NEUTRAL, 
        GOOD
    }
    
    protected Invoice(int id, int buyerId, int productId){
        super(id);
        this.buyerId = buyerId;
        this. productId = productId;
        this.date = new Date();
        this.rating = Rating.NONE;
        this.status = Status.WAITING_CONFIRMATION;
    }
    
    @Override
    public boolean read(String content){
        return false;
    }
    
    public double getTotalPay(){
        return 0.0;
    }
}

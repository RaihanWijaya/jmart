package MuhammadRaihanWijayaJmartMR;
import java.util.Date;
import java.util.ArrayList;
/**
 * Class for Invoice
 *
 * @author Muhammad Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public abstract class Invoice extends Serializable
{
    public int buyerId;
    public int complaintId;
    public Date date;
    public ArrayList<Record> history = new ArrayList<Record>();
    public int productId;
    public Rating rating;
    public Status status;

    protected Invoice(int buyerId, int productId){
        this.buyerId = buyerId;
        this. productId = productId;
        this.date = new Date();
        this.rating = Rating.NONE;
        this.status = Status.WAITING_CONFIRMATION;
    }

    public abstract double getTotalPay();

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
    
    public class Record{
        public Status status;
        public Date date;
        public String message;
    }
}

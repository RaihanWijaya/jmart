package MuhammadRaihanWijayaJmartMR;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Class for Payment
 *
 * @author Muhammad Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public class Payment extends Invoice
{
    List<Record> history = new ArrayList<Record>();
    public int productCount;
    public Shipment shipment;

    public Payment(int buyerId, int productId, int productCount, Shipment shipment){
        super(buyerId, productId);
        this.productCount = productCount;
        this.productId = productId;
        this.shipment = shipment;
    }
    
    public double getTotalPay(){
        return 0.0;
    }

    public static class Record{
        public Status status;
        public Date date;
        public String message;

        public Record(Status status, String message){
            this.status = status;
            this.message = message;
            this.date = java.util.Calendar.getInstance().getTime();
        }
    }
}

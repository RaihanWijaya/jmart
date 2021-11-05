package MuhammadRaihanWijayaJmartMR;
/**
 * Class for Payment
 *
 * @author Muhammad Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public class Payment extends Invoice
{
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
}

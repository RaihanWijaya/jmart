package com.MuhammadRaihanWijayaJmartMR;

import java.util.ArrayList;
import java.util.Date;

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
    public ArrayList<Record> history = new ArrayList<Record>();

    public Payment(int buyerId, int productId, int productCount, Shipment shipment){
        super(buyerId, productId);
        this.productCount = productCount;
        this.productId = productId;
        this.shipment = shipment;
    }

    @Override
    public double getTotalPay(Product product){
        return product.price * (product.discount/100) * productCount;
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
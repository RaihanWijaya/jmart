package com.MuhammadRaihanWijayaJmartMR;
import com.MuhammadRaihanWijayaJmartMR.dbjson.Serializable;

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
    public int productId;
    public Rating rating;

    protected Invoice(int buyerId, int productId){
        this.buyerId = buyerId;
        this. productId = productId;
        this.date = java.util.Calendar.getInstance().getTime();
        this.rating = Rating.NONE;
        this.complaintId = -1;
    }

    public abstract double getTotalPay(Product product);

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
}
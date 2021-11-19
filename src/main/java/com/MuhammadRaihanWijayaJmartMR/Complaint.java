package com.MuhammadRaihanWijayaJmartMR;
import java.util.Date;

/**
 * Class for Complaint
 *
 * @author Muhammad Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public class Complaint extends Serializable
{
    public Date date;
    public String desc;
    
    public Complaint(String desc){
        this.desc = desc;
        this.date = new Date();
    }

    public String toString(){
        return this.date + this.desc;
    }
}

package com.MuhammadRaihanWijayaJmartMR;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Class for Store
 *
 * @author Muhammad Raihan Wijaya
 * @version v1.0 in Modul 4
 */
public class Store
{
    public static final String REGEX_NAME = "^[A-Z](?!.*(\\s)\\1).{4,20}$";
    public static final String REGEX_PHONE = "^(\\d{9,12})$";
    public double balance;
    public String address, name, phoneNumber;
    
    public Store(String name, String address, String phoneNumber, double balance){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }
    
    public Store(Account account, String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public String toString(){
        return this.name + this.address + this.phoneNumber + this.balance;
    }

    public boolean validate(){
        Pattern patternPhone = Pattern.compile(REGEX_PHONE);
        Matcher matcherPhone = patternPhone.matcher(phoneNumber);
        boolean matchPhone = matcherPhone.find();
        boolean hasilPhone = matchPhone ? true : false;
        
        Pattern patternName = Pattern.compile(REGEX_NAME);
        Matcher matcherName = patternName.matcher(name);
        boolean matchName = matcherName.find();
        boolean hasilName = matchName ? true : false;

        if (hasilPhone == true && hasilName == true){
            return true;
        }
        else
            return false;
    }
}
package MuhammadRaihanWijayaJmartMR;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Store extends Recognizable implements FileParser
{
    public static final String REGEX_PHONE = "^(\\d{9,12})$", REGEX_NAME = "^[A-Z](?!(?:.*[ ]){2})(?!.(\\s)\1).{3,19}$";
    public String name, address, phoneNumber;
    
    public Store(int accountId, String name, String address, String phoneNumber){
        super(accountId);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public Store(Account account, String name, String address, String phoneNumber){
        super(account.id);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public boolean read(String content){
        return false;
    }
    
    public String toString(){
        return this.name + this.address + this.phoneNumber;
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
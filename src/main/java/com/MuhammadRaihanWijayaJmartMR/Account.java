package com.MuhammadRaihanWijayaJmartMR;

import com.MuhammadRaihanWijayaJmartMR.dbjson.Serializable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class for Account
 *
 * @author Muhammad Raihan Wijaya
 * @version v1.0 in Modul 4
 * @description Backend dari akun
 */

public class Account extends Serializable
{
    public static final String REGEX_EMAIL = "^\\w+([.&`~-]?\\w+)*@\\w+([.-]?\\w+)+$";
    public static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d][^-\\s]{8,}$";
    public double balance;
    public String email, name, password;
    public Store store;

    public Account(String name, String email, String password, double balance){
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    public boolean validate(){
        Pattern patternEmail = Pattern.compile(REGEX_EMAIL);
        Matcher matcherEmail = patternEmail.matcher(email);
        boolean matchEmail = matcherEmail.find();
        boolean hasilEmail = matchEmail ? true : false;
        
        Pattern patternPassword = Pattern.compile(REGEX_PASSWORD);
        Matcher matcherPassword = patternPassword.matcher(password);
        boolean matchPassword = matcherPassword.find();
        boolean hasilPassword = matchPassword ? true : false;

        if (hasilEmail == true && hasilPassword == true){
            return true;
        }
        else
            return false;
    }
}

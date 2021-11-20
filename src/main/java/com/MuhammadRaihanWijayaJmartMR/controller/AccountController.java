package com.MuhammadRaihanWijayaJmartMR.controller;
import com.MuhammadRaihanWijayaJmartMR.Account;
import com.MuhammadRaihanWijayaJmartMR.Store;
import com.MuhammadRaihanWijayaJmartMR.dbjson.JsonAutowired;
import com.MuhammadRaihanWijayaJmartMR.dbjson.JsonTable;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/account")
public class AccountController implements BasicGetController
{
    public static final String REGEX_EMAIL = "^\\w+([.&`~-]?\\w+)*@\\w+([.-]?\\w+)+$";
    public static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d][^-\\s]{8,}$";
    public static final Pattern REGEX_PATTERN_EMAIL = Pattern.compile(REGEX_EMAIL);
    public static final Pattern REGEX_PATTERN_PASSWORD = Pattern.compile(REGEX_PASSWORD);
    @JsonAutowired(value = Account.class, filepath = "C:/Users/Raihan Wijaya/Documents/Kuliah Universitas Indonesia/Tugas Kuliah/Semester 3/Praktikum OOP/Tugas/Case Study/jmart/src/main" +
            "/java/com/MuhammadRaihanWijayaJmartMR/dbjson/JsonAutowired.java")
    public static JsonTable<Account> accountTable;

    @GetMapping
    String index() { return "account page"; }

    @Override
    public JsonTable<Account> getJsonTable() {
        return accountTable;
    }

    @PostMapping("/login")
    @ResponseBody Account login
            (
                    @RequestParam String email,
                    @RequestParam String password
            )
    {
        for (Account each : accountTable){
            if(each.email.equals(email) && each.password.equals(password)){
                return each;
            }
        }
        return null;
    }

    @PostMapping("/register")
    Account register
            (
                    @RequestParam String name,
                    @RequestParam String email,
                    @RequestParam String password
            )
    {
        Matcher matchEmail = REGEX_PATTERN_EMAIL.matcher(email);
        boolean hasilEmail = matchEmail.find();
        Matcher matchPassword = REGEX_PATTERN_PASSWORD.matcher(email);
        boolean hasilPassword = matchPassword.find();
        if(!name.isBlank() || hasilEmail || hasilPassword ||
                accountTable.stream().anyMatch(account -> account.email.equals(email))){
            return new Account(name, email, password, 0);
        }
        return null;
    }

    @PostMapping("/{id}/registerStore")
    Store registerStore
            (
                    @RequestParam String id,
                    @RequestParam String name,
                    @RequestParam String address,
                    @RequestParam String phoneNumber
            )
    {
        for(Account each : accountTable){
            if (each.store == null){
                each.store = new Store(name,address,phoneNumber,0);
                return each.store;
            }
        }
        return null;
    }

    @PostMapping("/{id}/topUp")
    boolean topUp
            (
                    @RequestParam int id,
                    @RequestParam double balance
            )
    {
        for(Account each : accountTable){
            if(each.id == id){
                each.balance += balance;
                return true;
            }
        }
        return false;
    }
}
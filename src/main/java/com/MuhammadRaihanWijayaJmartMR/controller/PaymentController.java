package com.MuhammadRaihanWijayaJmartMR.controller;

import com.MuhammadRaihanWijayaJmartMR.Account;
import com.MuhammadRaihanWijayaJmartMR.ObjectPoolThread;
import com.MuhammadRaihanWijayaJmartMR.Payment;
import com.MuhammadRaihanWijayaJmartMR.dbjson.JsonAutowired;
import com.MuhammadRaihanWijayaJmartMR.dbjson.JsonTable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController implements BasicGetController {
    public static final long DELIVERED_LIMIT_MS = 100;
    public static final long ON_DELIVERY_LIMIT_MS = 100;
    public static final long ON_PROGRESS_LIMIT_MS = 100;
    public static final long WAITING_CONF_LIMIT_MS = 100;
    @JsonAutowired(value = Payment.class, filepath = "C:/Users/Raihan Wijaya/Documents/Kuliah Universitas Indonesia/Tugas Kuliah/Semester 3/Praktikum OOP/Tugas/Case Study/jmart/src/main" +
            "/java/com/MuhammadRaihanWijayaJmartMR/dbjson/JsonAutowired.java")
    public static JsonTable<Payment> paymentTable;
    ObjectPoolThread<Payment> poolThread;

    @Override
    public JsonTable<Payment> getJsonTable() {
        return paymentTable;
    }

    @PostMapping("/create")
    @ResponseBody
    Account login
            (
                    @RequestParam int id
            )
    {

    }
    @PostMapping(" /{id}/accept ")
    @ResponseBody
    Account login
            (
                    @RequestParam int id
            )
    {

    }
}

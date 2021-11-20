package com.MuhammadRaihanWijayaJmartMR.controller;

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
    @JsonAutowired(value = Payment.class, filepath = "Payment.json")
    public static JsonTable<Payment> paymentTable;
    ObjectPoolThread<Payment> poolThread;

    @Override
    public JsonTable<Payment> getJsonTable() {
        return paymentTable;
    }

    @PostMapping("/create")
    @ResponseBody Payment create
            (
                    @RequestParam int buyerId,
                    @RequestParam int productId,
                    @RequestParam int productCount,
                    @RequestParam String shipmentAddress,
                    @RequestParam byte shipmnetPlan
            )
    {
        return null;
    }

    @PostMapping(" /{id}/accept ")
    @ResponseBody boolean accept
            (
                    @RequestParam int id
            )
    {
        return false;
    }

    @PostMapping(" /{id}/cancel ")
    @ResponseBody boolean cancel
            (
                    @RequestParam int id
            )
    {
        return false;
    }

    @PostMapping(" /{id}/submit ")
    @ResponseBody boolean submit
            (
                    @RequestParam int id,
                    @RequestParam String receipt
            )
    {
        return false;
    }

    private static boolean timekeeper(Payment payment){
        return false;
    }
}
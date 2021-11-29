package com.MuhammadRaihanWijayaJmartMR.controller;

import com.MuhammadRaihanWijayaJmartMR.Algorithm;
import com.MuhammadRaihanWijayaJmartMR.Coupon;
import com.MuhammadRaihanWijayaJmartMR.dbjson.JsonAutowired;
import com.MuhammadRaihanWijayaJmartMR.dbjson.JsonTable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/coupon")
public class CouponControler implements BasicGetController<Coupon>
{
    @JsonAutowired(value = Coupon.class,filepath = "Coupon.json")
    public static JsonTable<Coupon> couponTable;

    @Override
    public JsonTable<Coupon> getJsonTable() {
        return couponTable;
    }

    @GetMapping("/{id}/canApply")
    @ResponseBody
    boolean canApply
            (
                    @RequestParam int id,
                    @RequestParam double price,
                    @RequestParam double discount
            )
    {
        for(Coupon each : couponTable)
        {
            if (each.id == id) {
                return each.canApply(price, discount);
            }
        }
        return false;
    }

    @GetMapping("/{id}/isUsed")
    @ResponseBody
    boolean isUsed
            (
                    @RequestParam int id
            )
    {
        for(Coupon each : couponTable)
        {
            if (each.id == id) {
                return each.isUsed();
            }
        }
        return false;
    }

    @GetMapping("/getAvailable")
    @ResponseBody
    List<Coupon> getAvailable
            (
                    @RequestParam int page,
                    @RequestParam int pageSize
            )
    {
        return Algorithm.paginate(couponTable, page, pageSize, pred-> !pred.isUsed());
    }

    @Override
    public Coupon getById(int id) {
        return BasicGetController.super.getById(id);
    }

    @Override
    public List getPage(int page, int pageSize) {
        return BasicGetController.super.getPage(page, pageSize);
    }
}
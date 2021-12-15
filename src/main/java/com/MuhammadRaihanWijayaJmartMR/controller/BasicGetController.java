package com.MuhammadRaihanWijayaJmartMR.controller;

/**
 * The class BasicGetController <T extends Serializable>
 * @author Raihan Wijaya
 * @description Digunakan untuk sebagai controller basic, seperti mencari akun dari id dan mengambil page
 */

import java.util.List;

import com.MuhammadRaihanWijayaJmartMR.Algorithm;
import com.MuhammadRaihanWijayaJmartMR.dbjson.Serializable;
import org.springframework.web.bind.annotation.*;
import com.MuhammadRaihanWijayaJmartMR.dbjson.*;

@RestController
public interface BasicGetController <T extends Serializable> {
    @GetMapping("/{id}")
    public default T getById (@PathVariable int id){
        return Algorithm.<T>find(getJsonTable(),e -> e.id == id);
    }

    public abstract JsonTable<T> getJsonTable ();

    @GetMapping("/page")
    public default List<T> getPage(int page, int pageSize){
        final JsonTable<T> table = getJsonTable();
        return Algorithm.paginate(table,page,pageSize,o->true);
    }
}
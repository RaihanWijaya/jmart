package com.MuhammadRaihanWijayaJmartMR.controller;
import com.MuhammadRaihanWijayaJmartMR.dbjson.JsonTable;
import com.MuhammadRaihanWijayaJmartMR.dbjson.Serializable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface BasicGetController<T extends Serializable> {

    @GetMapping("/{id}")
    public default @ResponseBody T getById(int id) {
        return getJsonTable().get(id);
    }

    public abstract JsonTable<T> getJsonTable();

    @GetMapping("/page")
    public default @ResponseBody List<T> getPage(int page, int pageSize) {
        return getJsonTable().subList(page, pageSize);
    }
}

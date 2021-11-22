package com.MuhammadRaihanWijayaJmartMR.controller;

import java.util.List;
import com.MuhammadRaihanWijayaJmartMR.dbjson.Serializable;
import org.springframework.web.bind.annotation.*;
import com.MuhammadRaihanWijayaJmartMR.dbjson.*;

@RestController
public interface BasicGetController<T extends Serializable> {
    @GetMapping("/{id}")
    public default T getById(int id) {
        return getJsonTable().get(id);
    }

    public abstract JsonTable<T> getJsonTable();

    @GetMapping("/page")
    public default List<T> getPage(int page, int pageSize) {
        return getJsonTable().subList(page, page + pageSize);
    }
}
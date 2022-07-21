package com.postulacion.storeservice.controllers;

import com.postulacion.storeservice.entities.Store;
import com.postulacion.storeservice.repository.IStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stores")
public class StoreController {
    @Autowired
    private IStore iStore;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Store> getStores(){
        return iStore.getStores();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Store getStoreById(@PathVariable Long id){
        return iStore.getStoreById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStore(@RequestBody Store store){
        iStore.saveStore(store);
    }
}

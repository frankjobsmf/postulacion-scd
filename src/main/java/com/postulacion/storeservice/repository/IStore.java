package com.postulacion.storeservice.repository;

import com.postulacion.storeservice.entities.Store;

import java.util.List;
import java.util.Set;

public interface IStore {
    public List<Store> getStores();
    public Store getStoreById(Long id);
    public void saveStore(Store store);
}

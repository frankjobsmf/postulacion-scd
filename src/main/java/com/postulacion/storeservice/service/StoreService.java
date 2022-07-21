package com.postulacion.storeservice.service;

import com.postulacion.storeservice.dao.StoreDao;
import com.postulacion.storeservice.entities.Store;
import com.postulacion.storeservice.repository.IStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StoreService implements IStore {

    @Autowired
    private StoreDao storeDao;

    @Override
    public List<Store> getStores() {
        return (List<Store>) storeDao.findAll();
    }

    @Override
    public Store getStoreById(Long id) {
        return storeDao.findById(id).orElse(null);
    }

    @Override
    public void saveStore(Store store) {
        storeDao.save(store);
    }
}

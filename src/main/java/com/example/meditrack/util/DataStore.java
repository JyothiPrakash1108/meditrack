package com.example.meditrack.util;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DataStore<T> {
    private Map<String,T> store = new HashMap<>();

    public void add(String id,T entity){
        store.put(id, entity);
    }
    public Optional<T> getById(String id){
        return Optional.ofNullable(store.get(id));
    }
    public List<T> getAll(){
        return (List<T>) store.values();
    }
    public T remove(String id){
        return store.remove(id);
    }
    public boolean exists(String id){
        return store.containsKey(id);
    }
}

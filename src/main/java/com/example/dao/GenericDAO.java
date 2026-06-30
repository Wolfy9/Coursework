/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao;

import com.example.model.BaseModel;
import java.util.List;

/**
 *
 * @author yingj
 */
public class GenericDAO<T extends BaseModel> {

    private final List<T> Info;

    public GenericDAO(List<T> info) {
        this.Info = info;
    }

    public T getById(String id) {
        for (T info : Info) {
            if (info.getId().equals(id)) {
                return info;
            }

        }
        return null;

    }

    public List<T> getAll() {
        return Info;
    }
        
    public void add(T info) {
        info.setId("ID-" + (Info.size() + 1));
        Info.add(info);
    }


public void update(T updatedItem) {
        for (int i = 0; i < Info.size(); i++) {
            T info = Info.get(i);
            if (info.getId() == updatedItem.getId()) {
                Info.set(i, updatedItem);
                return;
            }
        }
    }
    
    public void delete(String id){
    Info.removeIf(item -> item.getId().equals(id));
    }

}

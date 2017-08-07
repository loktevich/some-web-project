package edu.shop.java.dao.impl;

import java.util.List;

import edu.shop.java.dao.accessors.DatabaseDatasourceAccessor;
import edu.shop.java.model.Model;

public abstract class HibernateAbstractDao<T extends Model> extends DatabaseDatasourceAccessor {

    public List<T> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    public T getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    public void add(T model) {
        // TODO Auto-generated method stub

    }

    public void update(T model) {
        // TODO Auto-generated method stub

    }

    public void remove(Long id) {
        // TODO Auto-generated method stub

    }

    public void remove(T model) {
        // TODO Auto-generated method stub

    }
    
    @Override
    public String getHost() {
        return null;
    }

    @Override
    public int getPort() {
        return 0;
    }

}

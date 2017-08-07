package edu.shop.java.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.shop.java.dao.ProductDao;
import edu.shop.java.dao.accessors.DatabaseDatasourceAccessor;
import edu.shop.java.model.Product;

@Repository
public class ProductDatabaseDao extends DatabaseDatasourceAccessor implements ProductDao {

    public ProductDatabaseDao() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(Product model) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Product model) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Product model) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getHost() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getPort() {
        // TODO Auto-generated method stub
        return 0;
    }

}

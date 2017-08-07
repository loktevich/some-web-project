package edu.shop.java.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.shop.java.dao.ProductCategoryDao;
import edu.shop.java.dao.accessors.DatabaseDatasourceAccessor;
import edu.shop.java.model.ProductCategory;

@Repository(value = "productCategoryDatabaseDao")
public class ProductCategoryDatabaseDao extends DatabaseDatasourceAccessor
        implements ProductCategoryDao {

    public ProductCategoryDatabaseDao() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<ProductCategory> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductCategory getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(ProductCategory model) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(ProductCategory model) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(ProductCategory model) {
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

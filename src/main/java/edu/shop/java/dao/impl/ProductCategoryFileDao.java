package edu.shop.java.dao.impl;

import java.util.List;

import edu.shop.java.dao.ProductCategoryDao;
import edu.shop.java.dao.accessors.FileDatasourceAccessor;
import edu.shop.java.model.ProductCategory;

public class ProductCategoryFileDao extends FileDatasourceAccessor
        implements ProductCategoryDao {

    public ProductCategoryFileDao() {
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
    public String getDatasourceName() {
        // TODO Auto-generated method stub
        return null;
    }

}

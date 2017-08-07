package edu.shop.java.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.shop.java.dao.OrderDao;
import edu.shop.java.dao.accessors.FileDatasourceAccessor;
import edu.shop.java.model.Order;

@Repository(value = "orderFileDao")
public class OrderFileDao extends FileDatasourceAccessor implements OrderDao {

    public OrderFileDao() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<Order> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(Order model) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Order model) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Order model) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getDatasourceName() {
        // TODO Auto-generated method stub
        return null;
    }

}

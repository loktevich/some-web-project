package edu.shop.java.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.shop.java.dao.UserDao;
import edu.shop.java.dao.accessors.DatabaseDatasourceAccessor;
import edu.shop.java.model.User;

@Repository
public class UserDatabaseDao extends DatabaseDatasourceAccessor implements UserDao {

    public UserDatabaseDao() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<User> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(User model) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(User model) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(User model) {
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

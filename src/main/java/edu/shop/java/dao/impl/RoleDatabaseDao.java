package edu.shop.java.dao.impl;

import java.util.List;

import edu.shop.java.dao.RoleDao;
import edu.shop.java.dao.accessors.DatabaseDatasourceAccessor;
import edu.shop.java.model.Role;

public class RoleDatabaseDao extends DatabaseDatasourceAccessor implements RoleDao {

    public RoleDatabaseDao() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<Role> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Role getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(Role model) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Role model) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Role model) {
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

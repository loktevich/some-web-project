package edu.shop.java.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.shop.java.dao.RoleDao;
import edu.shop.java.dao.accessors.FileDatasourceAccessor;
import edu.shop.java.model.Role;

@Repository(value = "roleFileDao")
public class RoleFileDao extends FileDatasourceAccessor implements RoleDao {

    public RoleFileDao() {
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
    public String getDatasourceName() {
        // TODO Auto-generated method stub
        return null;
    }

}

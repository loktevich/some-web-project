package edu.shop.java.model;

import java.io.Serializable;

public class Model implements Serializable {

    private static final long serialVersionUID = -2921830326001375227L;
    
    private Long id;

    public Model() {

    }

    public Model(Long id) {
        this.setId(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

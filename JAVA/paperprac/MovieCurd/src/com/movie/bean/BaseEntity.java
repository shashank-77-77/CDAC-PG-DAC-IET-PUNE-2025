package com.movie.bean;

public class BaseEntity {
    protected int id;

    public BaseEntity() {}

    public BaseEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

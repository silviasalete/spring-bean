package com.springbean.model;


public class Item {
    private Long id;
    private String context;

    public Item(long l, String s) {
        this.id = l;
        this.context = s;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", context='" + context + '\'' +
                '}';
    }
}

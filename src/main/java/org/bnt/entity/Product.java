package org.bnt.entity;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private int pid;

    private int providerid;

    private int producerid;

    private String nameproduct;

    private double price;

    public Product() {
        super();
    }
    public Product(int pid, int providerid, int producerid, String nameproduct, double price) {

        this.pid = pid;
        this.providerid = providerid;
        this.producerid = producerid;
        this.nameproduct = nameproduct;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getProviderid() {
        return providerid;
    }

    public void setProviderid(int providerid) {
        this.providerid = providerid;
    }

    public int getProducerid() {
        return producerid;
    }

    public void setProducerid(int producerid) {
        this.producerid = producerid;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", providerid=" + providerid +
                ", producerid=" + producerid +
                ", nameproduct='" + nameproduct + '\'' +
                ", price=" + price +
                '}';
    }
}
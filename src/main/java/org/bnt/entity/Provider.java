package org.bnt.entity;

import java.io.Serializable;

public class Provider implements Serializable {

    private static final long serialVersionUID = 1L;

    private int providerid;

    private String nameprovider;

    private String cityprovider;

    public Provider(){
        super();
    }

    public Provider(int providerid, String nameprovider, String cityprovider) {
        this.providerid = providerid;
        this.nameprovider = nameprovider;
        this.cityprovider = cityprovider;
    }

    public int getProviderid() {
        return providerid;
    }

    public void setProviderid(int providerid) {
        this.providerid = providerid;
    }

    public String getNameprovider() {
        return nameprovider;
    }

    public void setNameprovider(String nameprovider) {
        this.nameprovider = nameprovider;
    }

    public String getCityprovider() {
        return cityprovider;
    }

    public void setCityprovider(String cityprovider) {
        this.cityprovider = cityprovider;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "providerid=" + providerid +
                ", nameprovider='" + nameprovider + '\'' +
                ", cityprovider='" + cityprovider + '\'' +
                '}';
    }
}

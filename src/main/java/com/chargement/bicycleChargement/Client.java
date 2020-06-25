package com.chargement.bicycleChargement;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Client {

    @Column(name = "name")
    private String name;

    @Column(name = "uid")
    private String uid;

    @Column(name = "nif")
    private int nif;

    @Column(name = "pay_method")
    private String payMethod;

    @Column(name = "email")
    private String email;


    protected Client(String name,String email, String uid, int nif, String payMethod){
        this.name = name;
        this.email = email;
        this. uid = uid;
        this.nif = nif;
        this.payMethod = payMethod;
    }

    public String getName(){return this.name;}
    public void setName(String name) {this.name = name;}

    public String getEmail(){return this.email;}
    public void setEmail(String email) {this.email = email;}

    public String getUid(){return this.uid;}
    public void setUid(String uid) {this.uid = uid;}

    public float getNif(){return this.nif;}
    //public void setNif(int nif){this.nif = nif;}

    public String getPayMethod(){return this.payMethod;}
    public void setPayMethod(String payMethod) {this.payMethod = payMethod;}

    @Override
    public String toString() {
        return "Client{" +
                "name=" + name +
                ", email='" + email + '\'' +
                ", ID='" + uid + '\'' +
                ", Nif=" + nif + '\'' +
                ", Payment method=" + payMethod +
                '}';
    }
}

package com.netcracker.musicband.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //private int groupId;
    private String name;

    public Instrument(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

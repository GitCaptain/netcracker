package com.netcracker.musicband.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Key {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private char key;

    Key(){
        //TODO load key schema from some file
    }

    public char getKey() {
        return key;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKey(char key) {
        this.key = key;
    }
}

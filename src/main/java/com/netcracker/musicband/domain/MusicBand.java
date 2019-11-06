package com.netcracker.musicband.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class MusicBand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bandName;
    private Date createDate;

    public MusicBand(){}

    public MusicBand(String bandName, Date createDate) {
        this.bandName = bandName;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString(){
        return "name = " + bandName + ", create date = " + createDate;
    }

}

package com.netcracker.musicband.domain;

import org.springframework.data.util.Pair;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Map;
import java.util.Vector;

@Entity
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Date createDate;
    private Map<String, Vector<Pair<Character,Integer>>> track;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Map<String, Vector<Pair<Character, Integer>>> getTrack() {
        return track;
    }

    public void setTrack(Map<String, Vector<Pair<Character, Integer>>> track) {
        this.track = track;
    }
}

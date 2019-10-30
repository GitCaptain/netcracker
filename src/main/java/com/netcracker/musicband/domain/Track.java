package com.netcracker.musicband.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Vector;
import javafx.util.Pair;

@Entity
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Date createDate;

    //TODO переделать, пока хз во что упаковать json
    private Map<String, Vector<Pair<Character,Integer>>> track;

}

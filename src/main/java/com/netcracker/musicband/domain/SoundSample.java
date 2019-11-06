package com.netcracker.musicband.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SoundSample {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String pathToSoundFile;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPathToSoundFile() {
        return pathToSoundFile;
    }

    public void setPathToSoundFile(String pathToSoundFile) {
        this.pathToSoundFile = pathToSoundFile;
    }
}

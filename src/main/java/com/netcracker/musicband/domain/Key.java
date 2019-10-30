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
}

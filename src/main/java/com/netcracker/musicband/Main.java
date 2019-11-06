package com.netcracker.musicband;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        try {
            System.setErr(new PrintStream(new File("log.txt")));
        }
        catch (Exception e){
            return;
        }
        SpringApplication.run(Main.class, args);
    }
}

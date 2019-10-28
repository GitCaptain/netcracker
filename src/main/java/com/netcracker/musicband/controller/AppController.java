package com.netcracker.musicband.controller;


import com.netcracker.musicband.domain.MusicBand;
import com.netcracker.musicband.domain.Instrument;
import com.netcracker.musicband.repository.GroupRepository;
import com.netcracker.musicband.repository.InstrumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
public class AppController {

    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private InstrumentRepository instrumentRepository;


    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/groups")
    public String groups(Map<String, Object> model){
        Iterable<MusicBand> groups = groupRepository.findAll();
        model.put("groups", groups);
        return "groups";
    }

    @PostMapping("/groups")
    public String createGroup(@RequestParam String groupName, Map<String, Object> model){
        MusicBand musicBand = new MusicBand(groupName, new Date());
        groupRepository.save(musicBand);
        return "groups";
    }

    @GetMapping("/instruments")
    public String intruments(Map<String, Object> model){
        Iterable<Instrument> instruments = instrumentRepository.findAll();
        model.put("instrunents", instruments);
        return "instruments";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model){
        return "main";
    }



}

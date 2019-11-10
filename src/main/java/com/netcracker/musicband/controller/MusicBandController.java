package com.netcracker.musicband.controller;

import com.netcracker.musicband.domain.MusicBand;
import com.netcracker.musicband.repository.MusicBandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.Map;

@Controller
public class MusicBandController {


    private final static Logger logger = LogManager.getLogger(MusicBandController.class);

    private static final String MUSIC_BAND = "MusicBands";

    @Autowired
    private MusicBandRepository musicBandRepository;

    @GetMapping("/music_bands")
    public String groups(Map<String, Object> model){
        Iterable<MusicBand> groups = musicBandRepository.findAll();
        model.put(MUSIC_BAND, groups);
        return "music_bands";
    }

    @PostMapping("/music_bands/choose")
    public String chooseGroup(@RequestParam int id, Map<String, Object> model){
        return "redirect:/instruments";
    }

    @PostMapping("/music_bands/add")
    public String createGroup(@RequestParam String groupName, Map<String, Object> model){
        MusicBand musicBand = new MusicBand(groupName, new Date());
        musicBandRepository.save(musicBand);
        logger.info("new musicBand added: " + musicBand);
        return "redirect:/music_bands"; //redirect to update view
    }
}

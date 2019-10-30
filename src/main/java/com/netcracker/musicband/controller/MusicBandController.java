package com.netcracker.musicband.controller;

import com.netcracker.musicband.domain.MusicBand;
import com.netcracker.musicband.repository.MusicBandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
public class MusicBandController {

    private static final String MUSIC_BAND = "MusicBands";
    private static final String MUSIC_BAND_PATH =  "music_bands";
    @Autowired
    private MusicBandRepository musicBandRepository;

    @GetMapping("/"+MUSIC_BAND_PATH)
    public String groups(Map<String, Object> model){
        Iterable<MusicBand> groups = musicBandRepository.findAll();
        model.put(MUSIC_BAND, groups);
        return MUSIC_BAND_PATH;
    }

    @PostMapping("/"+MUSIC_BAND_PATH)
    public String createGroup(@RequestParam String groupName, Map<String, Object> model){
        MusicBand musicBand = new MusicBand(groupName, new Date());
        musicBandRepository.save(musicBand);
        Iterable<MusicBand> groups = musicBandRepository.findAll();
        model.put(MUSIC_BAND, groups);
        return MUSIC_BAND_PATH;
    }
}

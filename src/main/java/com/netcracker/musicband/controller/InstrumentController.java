package com.netcracker.musicband.controller;

import com.netcracker.musicband.domain.Instrument;
import com.netcracker.musicband.repository.InstrumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class InstrumentController {

    @Autowired
    private InstrumentRepository instrumentRepository;

    private static final String INSTRUMENTS = "INSTRUMENTS";

    @GetMapping("/instruments")
    public String intruments(Map<String, Object> model){
        Iterable<Instrument> instruments = instrumentRepository.findAll();
        model.put("instruments", instruments);
        return "instruments";
    }

    @PostMapping("/instruments/choose")
    public String chooseInstrument(Instrument instrument, Map<String, Object> model){
        return "redirect:/main";
    }

    @PostMapping("/instruments/add")
    public String addInstruments(Instrument instrument, Map<String, Object> model){
        instrumentRepository.save(instrument);
        return "instruments";
    }
}

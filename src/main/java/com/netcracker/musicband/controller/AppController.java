package com.netcracker.musicband.controller;


import com.netcracker.musicband.domain.Group;
import com.netcracker.musicband.repository.GroupRepository;
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

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/groups")
    public String groups(Map<String, Object> model){
        Iterable<Group> groups = groupRepository.findAll();
        model.put("groups", groups);
        return "groups";
    }

    @PostMapping("/groups")
    public String createGroup(@RequestParam String groupName, Map<String, Object> model){
        Group group = new Group(groupName, new Date());
        groupRepository.save(group);
        return "groups";
    }
}

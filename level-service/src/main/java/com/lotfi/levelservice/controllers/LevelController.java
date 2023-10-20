package com.lotfi.levelservice.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/level")
public class LevelController {

    @GetMapping("")
    public String getTest(){
        return "new Object";
    }
}

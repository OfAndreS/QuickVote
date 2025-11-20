package com.quickvote.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/status")
    public String verificarStatus() {
        return "QuickVote API está rodando com sucesso!";
    }
}
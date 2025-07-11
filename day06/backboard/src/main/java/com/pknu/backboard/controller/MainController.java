package com.pknu.backboard.controller;

import org.springframework.stereotype.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class MainController {

    @GetMapping("/start")
    public String start() {
        log.info("/start실행!");
        return "start"; // resource/templates/start.html 리턴 화면 출력
    }

}

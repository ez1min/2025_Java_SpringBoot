package com.qwak.spring03.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller // Springboot에서 컨트롤러로 동작할거야 라고 지칭해주는 주석 (어노테이션)
public class HelloController {
   
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        logger.info("hello url 오픈");
        logger.debug("디버그시 필요한로그입니다");
        logger.trace("디버그시 필요한 로그에요");

        logger.warn("경고 표시 로그입니다");
        logger.error("오류 표시 로그입니다");
        return "hello springboot!";
    }
}

package me.kkbk.comeet.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping("")
    public String showHome(){
        return "this is home";
    }

    @GetMapping("/time")
    public String showTime(){
        return "현재 서버시간은 " + new Date() + " 입니다.";
    }
}

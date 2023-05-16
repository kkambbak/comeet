package me.kkbk.comeet.member;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    private MemberDaoService service;

    public MemberController(MemberDaoService service){
        this.service = service;
    }

    @GetMapping("/members")
    public List<Member> retrieveAllUsers(){
        return service.findAll();
    }
}

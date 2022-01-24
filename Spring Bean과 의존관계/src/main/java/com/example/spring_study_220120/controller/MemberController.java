package com.example.spring_study_220120.controller;

import com.example.spring_study_220120.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    // setter 주입
    /*@Autowired
    public void setMemberService(MemberService memberService){
        this.memberService = memberService;
    }*/

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}

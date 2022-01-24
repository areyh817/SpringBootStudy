package com.example.spring_study_220120.service;

import com.example.spring_study_220120.domain.Member;
import com.example.spring_study_220120.repository.MemberRepository;
import com.example.spring_study_220120.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}

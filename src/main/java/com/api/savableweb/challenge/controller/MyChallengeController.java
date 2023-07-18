package com.api.savableweb.challenge.controller;


import com.api.savableweb.challenge.service.ParticipateChallengeService;
import com.api.savableweb.member.dto.MyChallengeInfoDto;
import com.api.savableweb.member.dto.MyRankingInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.DoubleStream.builder;

@Slf4j
@RestController
@RequestMapping("/challenge")
public class MyChallengeController {
    private final ParticipateChallengeService participateChallengeService;

    public MyChallengeController(ParticipateChallengeService participateChallengeService) {
        this.participateChallengeService = participateChallengeService;
    }

    @GetMapping
    public List<MyChallengeInfoDto> getMyChallengeInfo(@RequestParam String kakaoId){
        log.info("challenge controller={}",kakaoId);
        return participateChallengeService.getMyParticipateChallenge(kakaoId);
    }
}

package com.api.savableweb.member.controller;

import com.api.savableweb.member.dto.MyRankingInfoDto;
import com.api.savableweb.member.dto.RankingDto;
import com.api.savableweb.member.service.RankingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/ranking")
public class RankingController {
    private final RankingService rankingService;

    public RankingController(RankingService rankingService) {
        this.rankingService = rankingService;
    }
    @GetMapping
    public RankingDto getAllRankingInfo(@RequestParam String kakaoId){
        log.info("{}",kakaoId);
        return RankingDto.builder().privateRankingInfo(rankingService.getMyPrivateRankingInfo(kakaoId))
                .rankingListInfo(rankingService.getMyRankingInfo())
                .build();
    }
}

package com.api.savableweb.member.repository;

import com.api.savableweb.member.dto.MyChallengeInfoDto;
import com.api.savableweb.member.dto.MyMainInfoDto;
import com.api.savableweb.member.dto.MyPrivateRankingInfoDto;
import com.api.savableweb.member.dto.MyRankingInfoDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository {
    MyPrivateRankingInfoDto findByKakaoId(String kakaoId);

    List<MyRankingInfoDto> findRankingInfoList();

    List<MyChallengeInfoDto> findParticipateChallengeList(String kakaoId);

    MyMainInfoDto findMainInfoByKakaoId(String kakaoId);

}


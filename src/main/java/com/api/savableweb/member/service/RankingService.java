package com.api.savableweb.member.service;

import com.api.savableweb.member.dto.MyPrivateRankingInfoDto;
import com.api.savableweb.member.dto.MyRankingInfoDto;
import com.api.savableweb.member.entity.Certification;
import com.api.savableweb.member.entity.Member;
import com.api.savableweb.member.repository.MemberJdbcRepository;
import com.api.savableweb.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RankingService {

    private final MemberRepository memberRepository;

    public List<MyRankingInfoDto> getMyRankingInfo(){
        return memberRepository.findRankingInfoList();
    }
    public MyPrivateRankingInfoDto getMyPrivateRankingInfo(String kakaoId) {
        return memberRepository.findByKakaoId(kakaoId);
    }


}

package com.api.savableweb.member.service;

import com.api.savableweb.member.dto.MyRankingInfoDto;
import com.api.savableweb.member.entity.Certification;
import com.api.savableweb.member.entity.Member;
import com.api.savableweb.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankingService {
    private MemberRepository memberRepository;

    @Autowired
    public RankingService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // TODO: 서비스 메소드
//    public MyRankingInfoDto getMyRankingInfo(String kakaoId){
//        Member byKakaoIdData = memberRepository.findByKakaoId(kakaoId);
//        Long savedMoney = byKakaoIdData.getSavedMoney();
//        String username = byKakaoIdData.getUsername();
//        List<Certification> certificationList = byKakaoIdData.getCertificationList();
//
//        return memberRepository.findByKakaoId(kakaoId);
}

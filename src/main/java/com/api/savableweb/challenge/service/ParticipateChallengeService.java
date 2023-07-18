package com.api.savableweb.challenge.service;

import com.api.savableweb.member.dto.MyChallengeInfoDto;
import com.api.savableweb.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParticipateChallengeService {
    private final MemberRepository memberRepository;

    public List<MyChallengeInfoDto> getMyParticipateChallenge(String kakaoId){
        return memberRepository.findParticipateChallengeList(kakaoId);
    }
}

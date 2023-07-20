package com.api.savableweb.member.service;

import com.api.savableweb.member.dto.MyMainInfoDto;
import com.api.savableweb.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {
    private final MemberRepository memberRepository;

    public MyMainInfoDto getMainInfo(String kakaoId){
        return memberRepository.findMainInfoByKakaoId(kakaoId);
    }

}

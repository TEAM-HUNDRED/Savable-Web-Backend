package com.api.savableweb.member.repository;

import com.api.savableweb.member.dto.MyPrivateRankingInfoDto;
import com.api.savableweb.member.dto.MyRankingInfoDto;
import com.api.savableweb.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository {
    MyPrivateRankingInfoDto findByKakaoId(String kakaoId);

    List<MyRankingInfoDto> findRankingInfoList();

}


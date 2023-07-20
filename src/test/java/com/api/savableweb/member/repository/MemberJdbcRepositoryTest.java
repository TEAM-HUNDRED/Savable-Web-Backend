package com.api.savableweb.member.repository;

import com.api.savableweb.member.dto.MyChallengeInfoDto;
import com.api.savableweb.member.dto.MyMainInfoDto;
import com.api.savableweb.member.dto.MyPrivateRankingInfoDto;
import com.api.savableweb.member.dto.MyRankingInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class MemberJdbcRepositoryTest {

    private MemberRepository repository;

    @Autowired
    public MemberJdbcRepositoryTest(DataSource dataSource) {
        this.repository = new MemberJdbcRepository(dataSource);
    }

    @Test
    public void getRankInfo() {
        List<MyRankingInfoDto> rankingInfoList = repository.findRankingInfoList();
        log.info("test result = {}", rankingInfoList);
    }

    @Test
    public void getPrivateRankInfo() {
        MyPrivateRankingInfoDto myDto = repository.findByKakaoId("6b81bf25809b8705c80efe6d893b14efa2cd253daf6323f980b9b4c8e6d09a3eb9");
        log.info("test result = {}", myDto);
    }

    @Test
    public void getMainInfo(){
        MyMainInfoDto mainInfoDto = repository.findMainInfoByKakaoId("ecf5a23fed577f32be2b341b72e81354deae3d2dd416c3539eb2a19e44bcb6eb32");
        log.info("test result = {}",mainInfoDto);
    }

    @Test
    public void getChallengeInfo() {
        List<MyChallengeInfoDto> myChallengeInfoDto = repository.findParticipateChallengeList("4d82be285a8b342f32bfcdf0af2d52d0f8a5ea726b128403e972865097f23c2c48");
        log.info("test result = {}", myChallengeInfoDto);
    }
}
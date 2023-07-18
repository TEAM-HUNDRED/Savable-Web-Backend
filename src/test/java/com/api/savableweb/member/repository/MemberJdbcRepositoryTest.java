package com.api.savableweb.member.repository;

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
        MyPrivateRankingInfoDto myDto = repository.findByKakaoId("c98b7711579e937282bf3a386f752ea6b0af0b940ee2e49a67787856b6fbed39e3");
        log.info("test result = {}", myDto);
    }
}
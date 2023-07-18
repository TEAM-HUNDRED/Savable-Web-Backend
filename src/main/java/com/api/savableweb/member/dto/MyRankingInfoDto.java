package com.api.savableweb.member.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class MyRankingInfoDto {

    private String username;
    private Integer certRank;

    public MyRankingInfoDto(String username, Integer certRank) {
        this.username = username;
        this.certRank = certRank;
    }
}

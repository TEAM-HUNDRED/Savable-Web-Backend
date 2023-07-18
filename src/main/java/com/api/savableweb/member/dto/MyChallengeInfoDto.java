package com.api.savableweb.member.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MyChallengeInfoDto {
    private String title;
    private Integer savedMoney;
    private Integer reward;
    private String username;

    public MyChallengeInfoDto(String title, Integer savedMoney, Integer reward,String username) {
        this.title = title;
        this.savedMoney = savedMoney;
        this.reward = reward;
        this.username=username;
    }
}


package com.sparta.myselectshop.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
//AccessToken 을 사용해서 카카오 서버에서 사용자 정보를 가져옴 -> 가지고 온 정보를 담아두기 위해 KakaoUserInfoDto 추가
@Getter
@NoArgsConstructor
public class KakaoUserInfoDto {
    private Long id;
    private String email;
    private String nicknmae;

    public KakaoUserInfoDto(Long id, String nicknmae, String email) {
        this.id = id;
        this.nicknmae = nicknmae;
        this.email = email;
    }
}
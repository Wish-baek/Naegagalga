package com.ssafy.commonpjt.api.dto;

import lombok.Data;

@Data
public class UserLogoutRequestDto {
    private String accessToken;
    private String refreshToken;
}

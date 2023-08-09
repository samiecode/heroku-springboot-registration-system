package com.samieteq.herokuspringbootregistrationsystem.domain.dto;

public record AuthenticationRequest(
        String username,
        String password
) {
}

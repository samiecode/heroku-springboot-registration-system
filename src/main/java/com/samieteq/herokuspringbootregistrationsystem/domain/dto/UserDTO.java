package com.samieteq.herokuspringbootregistrationsystem.domain.dto;

import java.util.List;

public record UserDTO(
        Long id,
        String fullName,
        String email,
        List<String> roles,
        String username,
        String accessToken
) {
}

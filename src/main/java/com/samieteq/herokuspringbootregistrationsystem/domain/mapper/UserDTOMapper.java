package com.samieteq.herokuspringbootregistrationsystem.domain.mapper;

import com.samieteq.herokuspringbootregistrationsystem.domain.dto.UserDTO;
import com.samieteq.herokuspringbootregistrationsystem.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class UserDTOMapper implements Function<User, UserDTO> {

    @Override
    public UserDTO apply(User user) {

        return new UserDTO(
                user.getId(),
                user.getFullName(),
                user.getEmail(),
                user.getAuthorities()
                        .stream()
                        .map(GrantedAuthority::getAuthority)
                        .collect(Collectors.toList()),
                user.getUsername(),
                user.getAccessToken()
        );
    }
}

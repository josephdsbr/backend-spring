package com.flexpag.backend.model.dto;

import com.flexpag.backend.model.exceptions.UserException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public @Data @AllArgsConstructor @NoArgsConstructor @Builder
class UserDTO {
    private Long id;

    @Email(message = UserException.NOT_EMAIL)
    @NotNull(message = UserException.NOT_NULL)
    private String email;

    @NotNull(message = UserException.NOT_NULL)
    @Size(min = 3, message = UserException.PASSWORD_MIN_SIZE)
    private String password;
}
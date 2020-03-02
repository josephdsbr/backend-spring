package com.flexpag.backend.model;

import com.flexpag.backend.model.exceptions.UserException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
public @Data @Builder @AllArgsConstructor @NoArgsConstructor
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Email
    @Column(name = "EMAIL")
    private String email;

    @NotNull(message = UserException.NOT_NULL)
    @Column(name = "PASSWORD_HASH")
    private String passwordHash;
}

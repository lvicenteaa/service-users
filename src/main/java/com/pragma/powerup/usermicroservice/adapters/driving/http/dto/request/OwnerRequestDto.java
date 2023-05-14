package com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class OwnerRequestDto {

    private String name;
    private String lastName;
    private String documentId;
    private String phone;
    private LocalDate BirthDay;
    private String email;
    private String password;

}

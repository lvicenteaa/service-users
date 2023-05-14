package com.pragma.powerup.usermicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request.OwnerRequestDto;
import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request.UserRequestDto;
import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.response.PersonResponseDto;

import java.util.List;

public interface IUserHandler {
    void saveUser(UserRequestDto userRequestDto);

    void saveOwner(OwnerRequestDto ownerRequestDto);

    void deleteUser(UserRequestDto userRequestDto);
    List<PersonResponseDto> getProvider(Integer page);
    PersonResponseDto getProvider(Long id);
    PersonResponseDto getEmployee(Long id);
    PersonResponseDto getClient(Long id);

}

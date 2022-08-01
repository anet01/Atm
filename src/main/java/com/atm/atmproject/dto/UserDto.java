package com.atm.atmproject.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder
public class UserDto {

    @NotEmpty(message = "Kullanıcı adı boş bırakılamaz")
    @Size(min = 4, max = 16)
    private String userName;

    @NotEmpty(message = "Şifre boş bırakılamaz")
    @Size(min = 4, max = 32)
    private String password;

    private boolean locked;
}

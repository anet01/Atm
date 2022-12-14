package com.atm.atmproject.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @NotEmpty(message = "Kullanıcı id boş bırakılamaz")
    private int id;

    @NotEmpty(message = "Kullanıcı adı boş bırakılamaz")
    @Size(min = 4, max = 16)
    private String userName;

    @NotEmpty(message = "Şifre boş bırakılamaz")
    @Size(min = 4, max = 32)
    private String password;

    @Size(min = 4, max = 32)
    private String newPassword;

    private boolean locked;
}

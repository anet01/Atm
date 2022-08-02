package com.atm.atmproject.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class JwtRequest {

    private static final long serialVersionUID = 5926468583005150707L;

    private String userName;
    private String password;


}

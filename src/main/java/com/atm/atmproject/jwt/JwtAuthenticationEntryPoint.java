package com.atm.atmproject.jwt;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;


@Component
@Log4j2
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {
    private static final long serialVersionUID = -7858869558953243875L;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {

        if(authException.getMessage().equals("Cannot invoke \"com.atm.atmproject.entitys.UserEntity.getUserName()\" because \"user\" is null")){
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Kullanıcı Bulunamadı");
        }else{
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
        }
        log.error("Yetkisiz Giriş");
    }
}


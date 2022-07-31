package com.atm.atmproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//Security Active
@SpringBootApplication

//Security Inactive
//@SpringBootApplication(exclude = {
//        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
//        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class})

//Auditing
//Kim ne zaman ekledi
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class AtmProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtmProjectApplication.class, args);
    }

}

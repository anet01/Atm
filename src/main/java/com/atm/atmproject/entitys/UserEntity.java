package com.atm.atmproject.entitys;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.extern.log4j.Log4j2;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity implements Serializable {

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    @JsonIgnore
    private String password;

    @Column(name = "locked")
    @JsonIgnore
    private Boolean locked = false;


}

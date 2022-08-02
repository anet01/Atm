package com.atm.atmproject.jwt;

import com.atm.atmproject.dto.UserDto;
import com.atm.atmproject.entitys.UserEntity;
import com.atm.atmproject.repository.userDao;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
@Log4j2
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private userDao userDao;

    @Autowired
    private PasswordEncoder bcryptEncoder;


    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;


    public UserDetails loadUserById(Long id) throws UsernameNotFoundException {
        //database böyle bir kullanıcı var mı?
        //UserEntity user = (UserEntity) userDao .findByUsername(username);
        Optional<UserEntity> user = userDao .findById(1L);

        if (user == null) {
            log.error("Böyle bir kullanıcı Yoktur");
            throw new UsernameNotFoundException("Böyle bir kullanıcı yoktur " + user.get().getUserName());
        }
        return new org.springframework.security.core.userdetails.User(user.get().getUserName(), user.get().getPassword(),
                new ArrayList<>());
    }


    @Override
    public UserDetails  loadUserByUsername(String userName) throws UsernameNotFoundException {
        //database böyle bir kullanıcı var mı?
         UserEntity user = userDao.findByUserName(userName);
        UserDetails userDetails = null;
        UserDetails result  = null;

        if (user == null) {
            log.error("Böyle bir kullanıcı Yoktur");
         //   return (UserDetails) new RsServiceResponse<UserDetails>("asd","asd",userDetails);

        }



        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
                new ArrayList<>());
    }

    //Database Username ve Passwordu set
    //password: maskelenmiş ==> maskeyi kaldırmak bcryptEncoder
    public UserEntity save(UserDto user) {
        UserEntity newUser = new UserEntity();
        newUser.setUserName(user.getUserName());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        return userDao.save(newUser);
    }



}

package com.atm.atmproject.repository;

import com.atm.atmproject.entitys.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface accountDao extends CrudRepository<UserEntity,Long> {
}

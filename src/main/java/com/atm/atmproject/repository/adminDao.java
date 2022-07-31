package com.atm.atmproject.repository;

import com.atm.atmproject.entitys.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface adminDao extends CrudRepository<UserEntity,Long> {


}

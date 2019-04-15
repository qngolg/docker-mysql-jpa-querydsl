package com.qngolg.dockermysqldemo.repository;

import com.qngolg.dockermysqldemo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface UserRepository extends JpaRepository<UserEntity, String>, QuerydslPredicateExecutor<UserEntity> {
}

package com.qngolg.dockermysqldemo.resources;

import com.qngolg.dockermysqldemo.entity.QUserEntity;
import com.qngolg.dockermysqldemo.entity.UserEntity;
import com.qngolg.dockermysqldemo.repository.UserRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class UserResources {

    private final UserRepository repository;
    private final JPAQueryFactory queryFactory;

    public UserResources(UserRepository repository, EntityManager entityManager) {
        this.repository = repository;
        this.queryFactory = new JPAQueryFactory(entityManager);
    }

    public void saveUser(UserEntity entity) {
        repository.save(entity);
    }

    //todo batch update use querydsl
    public void batchUpdate(List<UserEntity> entityList) {
        QUserEntity userEntity = QUserEntity.userEntity;

    }
}

package com.myschool.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.myschool.jpa.Authentication;
public interface AuthenticationRepository extends CrudRepository<Authentication, Long> {

    List<Authentication> findByUserId(String userId);

    List<Authentication> findByUserIdAndPassword(String userId, String password);

    @Transactional
    void deleteByUserIdAndPassword(String userId, String password);

    @Transactional
    void deleteByUserId(String userId);
}

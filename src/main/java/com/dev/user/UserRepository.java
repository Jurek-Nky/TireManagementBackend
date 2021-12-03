package com.dev.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findUserByVorNameAndNachName(String vorName, String nachName);

    Optional<User> findUserByVorName(String vorName);

    boolean existsUserByRole_RoleName(String rolename);
}
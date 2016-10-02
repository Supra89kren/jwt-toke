package com.repositories;

import com.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Администратор on 02.10.2016.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

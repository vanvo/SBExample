package org.example.sqliteexample.repository;

import org.example.sqliteexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

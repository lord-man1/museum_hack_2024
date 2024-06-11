package ru.museum_hack_2024.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.museum_hack_2024.store.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByUsername(String username);
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);
}

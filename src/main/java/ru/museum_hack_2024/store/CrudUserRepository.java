package ru.museum_hack_2024.store;

import java.util.List;

public interface CrudUserRepository {
    // null if not found, when updated
    User save(User user);

    // false if not found
    boolean delete(Long phone);

    // null if not found
    User getByPhone(Long phone);

    List<User> getAll();
}

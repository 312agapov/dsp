package ru.agapov.DSP.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.agapov.DSP.Entities.User;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}

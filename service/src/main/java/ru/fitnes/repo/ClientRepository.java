package ru.fitnes.repo;

import ru.fitnes.model.entity.FintesClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<FintesClient, Integer> {
}

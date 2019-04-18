package kg.it.firstBoot.repository;

import kg.it.firstBoot.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
}

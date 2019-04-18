package kg.it.firstBoot.service;

import kg.it.firstBoot.model.Computer;

import java.util.List;

public interface ComputerService {

    List<Computer> findAllComputer();

    Computer findComputerById(Long id);

    Computer saveComputer(Computer c);

}

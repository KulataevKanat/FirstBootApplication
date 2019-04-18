package kg.it.firstBoot.service;

import kg.it.firstBoot.model.Computer;
import kg.it.firstBoot.repository.ComputerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerServiceImpl implements ComputerService {
    private final ComputerRepository computerRepository;

    public ComputerServiceImpl(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @Override
    public List<Computer> findAllComputer() {
        return computerRepository.findAll();
    }

    @Override
    public Computer findComputerById(Long id) {

        return computerRepository.findById(id).get();
    }

    @Override
    public Computer saveComputer(Computer c) {

        return computerRepository.save(c);
    }
}

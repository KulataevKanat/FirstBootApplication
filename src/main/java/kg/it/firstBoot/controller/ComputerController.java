package kg.it.firstBoot.controller;

import kg.it.firstBoot.model.Computer;
import kg.it.firstBoot.service.ComputerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ComputerController.URLCOMPUTER)
public class ComputerController {
    public static final String URLCOMPUTER = "/computer";
    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @GetMapping
    public List<Computer> getComputers() {
        return computerService.findAllComputer();

    }

    @GetMapping("/{id}")
    public Computer getComputerById(@PathVariable Long id) {
        return computerService.findComputerById(id);

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Computer saveComputer(@RequestBody Computer c) {
        return computerService.saveComputer(c);
    }
}

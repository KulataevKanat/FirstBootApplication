package kg.it.firstBoot.bootstrap;

import kg.it.firstBoot.model.Computer;
import kg.it.firstBoot.repository.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ComputerBootstrap implements CommandLineRunner {
    private final ComputerRepository computerRepository;

    public ComputerBootstrap(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Computer computer1 = new Computer();
        computer1.setName("HP");
        computer1.setCPU("Intel Core i5 8600K");
        computer1.setRAM("8 gb");
        computer1.setVideoСard("NVidia GeForce RTX 2080");
        computerRepository.save(computer1);


        Computer computer2 = new Computer();
        computer2.setName("Acer");
        computer2.setCPU("Intel Core i3 7100");
        computer2.setRAM("4 gb");
        computer2.setVideoСard("Intel HD Graphics 630");

        computerRepository.save(computer2);


        Computer computer3 = new Computer();
        computer3.setName("Dell");
        computer3.setCPU("Intel Core i7 6700");
        computer3.setRAM("8 gb");
        computer3.setVideoСard("Intel HD Graphics 530");

        computerRepository.save(computer3);

    }
}

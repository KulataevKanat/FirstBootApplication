package kg.it.firstBoot.model;

import javax.persistence.*;

@Entity
@Table(name = "Computer")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String name;

    private String CPU;

    private String RAM;

    private String videoСard;

    public Computer() {

    }

    public Computer(long id, String name, String CPU, String RAM, String videoСard) {
        this.id = id;
        this.name = name;
        this.CPU = CPU;
        this.RAM = RAM;
        this.videoСard = videoСard;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getVideoСard() {
        return videoСard;
    }

    public void setVideoСard(String videoСard) {
        this.videoСard = videoСard;
    }
}

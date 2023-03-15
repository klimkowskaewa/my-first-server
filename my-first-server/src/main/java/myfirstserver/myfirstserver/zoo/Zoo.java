package myfirstserver.myfirstserver.zoo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Zoo {

    @Bean
    public Animal lion(@Qualifier("savanna") Enclosure enclosure) {
        Animal animal = new Lion();
        if (!enclosure.addAnimal(animal)) {
            throw new RuntimeException("Wrong enclosure");
        }
        return animal;
    }

    @Bean
    public Animal pelican(@Qualifier("cage") Enclosure enclosure) {
        Animal animal = new Pelican();
        if (!enclosure.addAnimal(animal)) {
            throw new RuntimeException("Wrong enclosure");
        }
        return animal;
    }

    @Bean
    public Animal crocodile(@Qualifier("jungle") Enclosure enclosure) {
        Animal animal = new Crocodile();
        if (!enclosure.addAnimal(animal)) {
            throw new RuntimeException("Wrong enclosure");
        }
        return animal;
    }

    @Bean
    public Animal frog(@Qualifier("jungle") Enclosure enclosure) {
        Animal animal = new Frog();
        if (!enclosure.addAnimal(animal)) {
            throw new RuntimeException("Wrong enclosure");
        }
        return animal;
    }

}
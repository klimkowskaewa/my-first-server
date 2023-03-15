package myfirstserver.myfirstserver.zoo;

import java.util.List;

public interface Enclosure {

    List<Phylum> enclosureFor();

    default boolean addAnimal(Animal animal) {
        return enclosureFor().contains(animal.phylum());
    }

}

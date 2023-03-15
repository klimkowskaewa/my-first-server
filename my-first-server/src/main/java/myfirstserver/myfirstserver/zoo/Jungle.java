package myfirstserver.myfirstserver.zoo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Jungle implements Enclosure{

    @Override
    public List<Phylum> enclosureFor(){
        return Arrays.asList(Phylum.AMPHIBIAN, Phylum.REPTILE);
    }

}
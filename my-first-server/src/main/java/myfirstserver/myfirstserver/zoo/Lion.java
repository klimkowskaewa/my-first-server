package myfirstserver.myfirstserver.zoo;

public class Lion implements Animal {

    @Override
    public Phylum phylum() {
        return Phylum.MAMMAL;
    }

    @Override
    public String name() {
        return "lion";
    }

}

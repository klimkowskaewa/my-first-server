package myfirstserver.myfirstserver.zoo;

public class Pelican implements Animal{

    @Override
    public Phylum phylum() {
        return Phylum.BIRD;
    }

    @Override
    public String name() {
        return "pelican";
    }

}

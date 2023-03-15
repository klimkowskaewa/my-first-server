package myfirstserver.myfirstserver.zoo;

public class Frog implements Animal{

    @Override
    public Phylum phylum() {
        return Phylum.AMPHIBIAN;
    }

    @Override
    public String name() {
        return "frog";
    }

}
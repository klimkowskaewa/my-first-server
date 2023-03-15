package myfirstserver.myfirstserver.zoo;

public class Crocodile implements Animal{

    @Override
    public Phylum phylum() {
        return Phylum.REPTILE;
    }

    @Override
    public String name() {
        return "crocodile";
    }

}
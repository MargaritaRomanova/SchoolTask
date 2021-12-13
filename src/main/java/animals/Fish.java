package animals;

import model.Size;

public class Fish extends Carnivorous implements Swim {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming in the pond");
    }

    @Override
    public Size getSize() {
        return Size.MEDIUM;
    }
}

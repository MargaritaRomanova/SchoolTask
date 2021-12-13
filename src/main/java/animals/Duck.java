package animals;

import model.Size;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void run() {
        System.out.println("Duck is running");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the pond");
    }

    @Override
    public String getVoice() {
        return "quack-quack";
    }

    @Override
    public Size getSize() {
        return Size.SMALL;
    }
}

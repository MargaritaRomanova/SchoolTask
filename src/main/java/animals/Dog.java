package animals;

import model.Size;

public class Dog extends Carnivorous implements Run, Voice {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public String getVoice() {
        return "woof-woof";
    }

    @Override
    public Size getSize() {
        return Size.MEDIUM;
    }
}

package animals;

import model.Size;

public class Cow extends Herbivore implements Run, Voice {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Cow is running");
    }

    @Override
    public String getVoice() {
        return "moo-moo";
    }

    @Override
    public Size getSize() {
        return Size.LARGE;
    }
}

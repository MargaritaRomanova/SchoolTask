package animals;

import model.Size;

public class Horse extends Herbivore implements Run, Voice {

    public Horse(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Horse is running");
    }

    @Override
    public String getVoice() {
        return "neigh-neigh";
    }

    @Override
    public Size getSize() {
        return Size.LARGE;
    }
}

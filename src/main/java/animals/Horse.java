package animals;

public class Horse extends Herbivore implements Run, Voice{

    @Override
    public void run() {
        System.out.println("Horse is running");
    }

    @Override
    public String getVoice() {
        return "neigh-neigh";
    }
}

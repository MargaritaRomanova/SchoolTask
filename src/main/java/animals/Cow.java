package animals;

public class Cow extends Herbivore implements Run, Voice {

    @Override
    public void run() {
        System.out.println("Cow is running");
    }

    @Override
    public String getVoice() {
        return "moo-moo";
    }
}

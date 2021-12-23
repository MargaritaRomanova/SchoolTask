package animals;

public class Dog extends Carnivorous implements Run, Voice {

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public String getVoice() {
        return "woof-woof";
    }
}

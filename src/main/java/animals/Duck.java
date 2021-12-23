package animals;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice{

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
}

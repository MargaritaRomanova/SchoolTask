package animals;

public class Fish extends Carnivorous implements Swim{

    @Override
    public void swim() {
        System.out.println("Fish is swimming in the pond");
    }
}
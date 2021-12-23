import animals.*;
import employee.Worker;
import food.Food;
import food.Grass;
import food.Meat;
import model.Aviary;
import model.Size;

public class Zoo {
    public static void main(String[] args) {
        Cow cow = new Cow("Cow");
        Dog dog = new Dog("Dog");
        Duck duck = new Duck("Duck");
        Fish fish = new Fish("Fish");
        Horse horse = new Horse("Horse");
        Kotik kotik = new Kotik("Kotik");
        Worker worker = new Worker();
        Food grass = new Grass();
        Food meat = new Meat();

        worker.feed(cow, meat);
        worker.feed(dog, meat);
        worker.feed(fish, grass);
        worker.feed(horse, grass);
        worker.feed(kotik, grass);

        System.out.println(worker.getVoice(kotik));
        System.out.println(worker.getVoice(duck));
        System.out.println(worker.getVoice(cow));
        System.out.println(worker.getVoice(dog));
        System.out.println(worker.getVoice(horse));

        Swim[] pond = createPond();
        for (int i = 0; i < pond.length; i++) {
            pond[i].swim();
        }

        fillCarnivorousAviary();
        fillHerbivoreAviary();
    }

    private static Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.MEDIUM);
    private static Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.LARGE);

    public static Swim[] createPond() {
        Swim[] pondForAnimal = new Swim[4];
        pondForAnimal[0] = new Fish("Fish");
        pondForAnimal[1] = new Fish("Fish");
        pondForAnimal[2] = new Duck("Duck");
        pondForAnimal[3] = new Duck("Duck");
        return pondForAnimal;
    }

    static void fillCarnivorousAviary() {
        carnivorousAviary.addAnimal(new Dog("Dog"));
        carnivorousAviary.addAnimal(new Dog("Dog"));
        carnivorousAviary.addAnimal(new Fish("Fish"));
        carnivorousAviary.addAnimal(new Fish("Fish"));
    }

    static void fillHerbivoreAviary() {
        herbivoreAviary.addAnimal(new Cow("Cow"));
        herbivoreAviary.addAnimal(new Cow("Cow"));
        herbivoreAviary.addAnimal(new Horse("Horse"));
        herbivoreAviary.addAnimal(new Horse("Horse"));
    }

    public static Carnivorous getCarnivorous(String name) {
        return carnivorousAviary.getAnimal(name);
    }

    public static Herbivore getHerbivore(String name) {
        return herbivoreAviary.getAnimal(name);
    }
}

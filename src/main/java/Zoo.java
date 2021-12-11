import animals.*;
import employee.Worker;
import food.Food;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Horse horse = new Horse();
        Kotik kotik = new Kotik();
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
    }

    public static Swim[] createPond() {
        Swim[] pondForAnimal = new Swim[4];
        pondForAnimal[0] = new Fish();
        pondForAnimal[1] = new Fish();
        pondForAnimal[2] = new Duck();
        pondForAnimal[3] = new Duck();
        return pondForAnimal;
    }
}

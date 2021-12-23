package employee;

import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {

    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public String getVoice(Voice animal) {
        return animal.getVoice();
    }
}

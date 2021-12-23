package employee;

import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {

    public void feed(Animal animal, Food food) {
        try {
            animal.eat(food);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getVoice(Voice animal) {
        return animal.getVoice();
    }
}

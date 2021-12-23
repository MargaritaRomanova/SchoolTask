package animals;

import food.Food;
import food.Meat;

public abstract class Herbivore extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("This animal does not meat");
        } else {
            satiety = satiety + food.getEnergy();
            System.out.println("This animal eating grass");
        }
    }
}

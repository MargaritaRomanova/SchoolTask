package animals;

import food.Food;
import food.Grass;

public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("This animal does not grass");
        } else {
            satiety = satiety + food.getEnergy();
            System.out.println("This animal eating meat");
        }
    }
}

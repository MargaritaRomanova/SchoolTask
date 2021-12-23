package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Herbivore extends Animal {

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            throw new WrongFoodException();
        } else {
            satiety = satiety + food.getEnergy();
            System.out.println("This animal eating grass");
        }
    }
}

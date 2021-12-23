package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            throw new WrongFoodException();
        } else {
            satiety = satiety + food.getEnergy();
            System.out.println("This animal eating meat");
        }
    }
}

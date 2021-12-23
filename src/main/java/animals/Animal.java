package animals;

import food.Food;

public abstract class Animal {

    int satiety;

    abstract public void eat(Food food);

    public int getSatiety() {
        return satiety;
    }

}

package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

import java.net.http.WebSocketHandshakeException;

public abstract class Animal {

    int satiety;
    public String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void eat(Food food) throws WrongFoodException;

    public int getSatiety() {
        return satiety;
    }

    public abstract Size getSize();
}

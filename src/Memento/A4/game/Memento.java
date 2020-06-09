package Memento.A4.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Memento implements Serializable {
    int money;
    ArrayList fruits;
    public int getMoney() {
        return money;
    }
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }
    void addFruit(String fruit) {
        fruits.add(fruit);
    }
    List getFruits() {
        return (List)fruits.clone();
    }
}

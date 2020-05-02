package FactoryMethod.A2.idcard;

import FactoryMethod.A2.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int id;
    IDCard(String owner, int id) {
        System.out.println(owner + "(" + id + ")のカードを作ります。");
        this.owner = owner;
        this.id = id;
    }
    @Override public void use() {
        System.out.println(owner + "(" + id + ")のカードを使います。");
    }
    public String getOwner() {
        return owner;
    }
    public int getID() { return id;}
}

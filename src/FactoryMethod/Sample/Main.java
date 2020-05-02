package FactoryMethod.Sample;

import FactoryMethod.Sample.framework.Factory;
import FactoryMethod.Sample.framework.Product;
import FactoryMethod.Sample.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("トマト");
        Product card2 = factory.create("レタス");
        Product card3 = factory.create("ベーコン");
        card1.use();
        card2.use();
        card3.use();
    }
}

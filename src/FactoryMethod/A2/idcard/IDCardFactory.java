package FactoryMethod.A2.idcard;

import FactoryMethod.A2.framework.Factory;
import FactoryMethod.A2.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory {
    private int nextID = 0;
    private Map idToOwnerTable = new HashMap();
    @Override protected Product createProduct(String owner) {
        return new IDCard(owner, nextID);
    }

    @Override protected void registerProduct(Product product) {
        int id = ((IDCard)product).getID();
        String owner = ((IDCard)product).getOwner();
        idToOwnerTable.put(id, owner);
        nextID++;
    }

    public Map getIdToOwnerTable() {
        return idToOwnerTable;
    }
}

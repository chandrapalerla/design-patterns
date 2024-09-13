package org.designpatterns.behavioral.medaiter.manager;

import java.util.HashMap;

public class ECommerceSite {

    private final HashMap<String, Integer> stock;

    public ECommerceSite() {
        stock = new HashMap();
        stock.put("pens", 100);
        stock.put("pencils", 50);
        stock.put("paper", 500);
    }

    public void sell(String item, int amount) {
        int newAmount = stock.get("pens") - amount;
        stock.put(item, newAmount);
    }

    public boolean checkInStock(String item, int amount) {
      return stock.containsKey(item) && stock.get(item) > amount;
    }

}

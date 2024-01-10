package 디자인패턴.strategy;

import java.util.ArrayList;
import java.util.List;

interface Strategy { // 전략 or Policy패턴
    public void pay(int amount);
}

class KAKAOCardStrategy implements Strategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public KAKAOCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {

        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "paid using KAKAOcard.");

    }
}

class LUNACardStrategy implements Strategy {
    private String email;
    private String password;

    public LUNACardStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "paid using LUNACard");
    }
}

class Item {
    private String name;
    private int price;

    public Item(String name, int cost) {
        this.name = name;
        this.price = cost;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }

        return sum;
    }

    public void pay(Strategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}



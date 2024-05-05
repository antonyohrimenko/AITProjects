package lesson23.homework;

/*
В классе покупателя добавить поле "количество денег" и методы:
1 "начать покупку" - принимает объект продавца, название товара и количество товара которое
нужно купить (все остальные методы можно вызвать внутри этого)
2 "отдать деньги за покупку", принимает количество денег которое нужно заплатить,
возвращает true если покупатель успешно оплатил покупку (деньги должны отниматься со счета при успешной оплате),
и false если у покупателя не хватает денег
 */
public class Customer extends Person {

    private double money; // количество денег

    public Customer(String name, double money) {
        super(name);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    // метод начать покупку
    public boolean startPurchase(Seller seller, String productName, int amount) {
        double price = seller.announcePrice(productName, amount);
        return payForPurchase(price);
    }

    private boolean payForPurchase(double amount) {
        if (money >= amount) {
            money -= amount;
            return true;
        }
        return false;
    }
}


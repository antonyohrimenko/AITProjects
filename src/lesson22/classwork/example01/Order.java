package lesson22.classwork.example01;

public class Order {


    // создаем список, где будем хранить наши заказы
    private MyArrayList orderList = new MyArrayList();

    // посчитать общую сумму
    // добавлять и убирать продукты
    // состав заказа

    public int getAmountOfProducts() {
        return orderList.getSize();
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < orderList.getSize(); i++) {
            total += orderList.get(i).getSubtotal();
        }
        return total;
    }

    public void addProduct (Product product, int amount){
        OrderDetails details = new OrderDetails(product, amount);
        orderList.add(details);
    }

    public void removeProduct (int id){
        for (int i = 0; i < orderList.getSize(); i++){
            if (orderList.get(i).getProduct().getId() == id){
                orderList.remove(i);
                break;
            }
        }
    }

}

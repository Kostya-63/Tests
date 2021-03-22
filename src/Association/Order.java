package Association;

import java.util.ArrayList;

public class Order
{
//Это агрегация, т.к. при удалении экземпляра заказа экземпляр Product продолжит существовать
    private ArrayList<Product> orders = new ArrayList<Product>();

    public void add(Product p)
    {
        orders.add(p);
    }


}
class Product{}

package Association;

public class Person {
    private String name;
    private String surName;
// Композиция - при удалении экземпляра Client экземпляр Order будет удален
    public class Client extends Person {

        String adress = "";

        Order order = new Order();

        public Client(String n, String sn) {
            surName = sn;
            name = n;
        }

        public String getAddress() {
            return adress;
        }

        public Order getOrders() {
            return this.order;
        }
    }
}

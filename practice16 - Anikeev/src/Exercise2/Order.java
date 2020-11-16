package Exercise2;

public class Order {
    private LinkedList<Item> list;

    public Order() {
        this.list = new LinkedList<>();
    }

    private boolean add(Item item) {
        return list.add(item);
    }

    private boolean remove(Item item) {
        return list.remove(item);
    }
}
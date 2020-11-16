package Exercise4;

public interface Order {
    boolean add(Item item);
    boolean delete(String name);
    int deleteAll(String name);
    int getOrderSize();
    Object[] getArray();
    int getBill();
    int getCountOf(String name);
    String[] getOrderNames();
    Object[] getSortedArrayByPrice();
}


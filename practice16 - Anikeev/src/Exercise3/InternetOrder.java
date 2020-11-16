package Exercise3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class InternetOrder {
    private CircleList<Item> list;

    public InternetOrder() {
        this.list = new CircleList<>();
    }

    public InternetOrder(Collection<Item> collection) {
        this.list = new CircleList<>(collection);
    }

    public boolean add(Item item) {
        return list.add(item);
    }

    public boolean delete(String name) {
        for (Item item : list.toArray()) {
            if (item.getName().equals(name)) {
                return list.remove(item);
            }
        }

        return false;
    }

    public int deleteAllOf(String name) {
        int count = 0;

        for (Item item : list.toArray()) {
            if (item.getName().equals(name)) {
                list.remove(item);
                count++;
            }
        }

        return count;
    }

    public int getOrderSize() {
        return list.getSize();
    }

    public Item[] getArray() {
        return list.toArray();
    }

    public int getBillSum() {
        int sum = 0;

        for (Item item : list.toArray()) {
            sum += item.getPrice();
        }

        return sum;
    }

    public int getCountOf(String name) {
        int count = 0;

        for (Item item : list.toArray()) {
            if (item.getName().equals(name)) {
                count++;
            }
        }

        return count;
    }

    public String[] getMenu() {
        HashSet<String> hashSet = new HashSet<>();

        for (Item item : list.toArray()) {
            hashSet.add(item.getName());
        }

        return (String[]) hashSet.toArray();
    }

    public Item[] getArrayByPrice() {
        return (Item[]) Arrays.stream(
                list.toArray())
                .sorted((item1, item2) -> (int) (item2.getPrice() - item1.getPrice()))
                .toArray();
    }
}

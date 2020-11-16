package Exercise4;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class RestarauntOrder implements Order{
    private CircleList<Item> list;

    public RestarauntOrder() {
        list = new CircleList<Item>();
    }

    public RestarauntOrder(Collection<Item> col) {
        list = new CircleList<Item>(col);
    }

    @Override
    public boolean add(Item item) {
        return list.add(item);
    }

    @Override
    public boolean delete(String name) {
        for (Item item : list.toArray()) {
            if (item.getName().equals(name)) {
                return list.remove(item);
            }
        }
        return false;
    }

    @Override
    public int deleteAll(String name) {
        int count = 0;

        for (Item item : list.toArray()) {
            if (item.getName().equals(name)) {
                list.remove(item);
                count++;
            }
        }

        return count;
    }

    @Override
    public int getOrderSize() {
        return list.getSize();
    }

    @Override
    public Object[] getArray() {
        return list.toArray();
    }

    @Override
    public int getBill() {
        int sum = 0;

        for (Item item : list.toArray()) {
            sum += item.getPrice();
        }

        return sum;
    }

    @Override
    public int getCountOf(String name) {
        int count = 0;

        for (Item item : list.toArray()) {
            if (item.getName().equals(name)) {
                count++;
            }
        }

        return count;
    }

    @Override
    public String[] getOrderNames() {
        HashSet<String> hashSet = new HashSet<>();

        for (Item item : list.toArray()) {
            hashSet.add(item.getName());
        }

        return (String[]) hashSet.toArray();
    }

    @Override
    public Object[] getSortedArrayByPrice() {
        return (Item[]) Arrays.stream(
                list.toArray())
                .sorted((item1, item2) -> (int) (item2.getPrice() - item1.getPrice()))
                .toArray();
    }
}

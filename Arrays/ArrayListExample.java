import java.util.ArrayList;

public class ArrayListExample {
    // Dynamic arrays
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        // <Integer> need to mention the wrapper class Integer here. Not primitive int
        // 10: here is initial capacity. But can add any number of elements
        list.add(99);
        list.add(199);
        list.add(89);
        list.add(96);
        list.add(2);
        list.add(1);
        System.out.println("list: " + list);
        System.out.println("contains: " + list.contains(89));
        list.set(0, 99); // (index, newValue)
        System.out.println("list: " + list);
        System.out.println("get: " + list.get(3)); // index
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(0);
        list.addAtIndex(2, 10);
        System.out.println("Element at index 2: " + list.get(2));
        list.removeFirst();
        list.removeLast();
        list.removeAtIndex(1);

    }
}
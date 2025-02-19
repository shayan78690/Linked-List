import java.util.LinkedList;

public class JCFLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(5);
        list.addLast(6);
        list.addFirst(10);
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}

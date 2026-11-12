import java.util.*;
public class set {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        a.add(0);
        a.add(4);
        b.add(2);
        b.add(67);
        b.addAll(a);
        b.removeIf(n-> n%2==0);
        System.out.println(b);
    }
}

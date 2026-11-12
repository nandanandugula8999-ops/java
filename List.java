import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Test{
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>(Arrays.asList(10, 20, 30));
        c.add(10);
        System.out.println(c);
    }
}
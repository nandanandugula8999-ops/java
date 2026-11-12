import java.util.*;
public class set1 {
    public static void main(String[] args) {
        Set<String> s = new LinkedHashSet<>(
            Arrays.asList("Nandan","Padmaja","Abhi","Dhruthi"));
            System.out.println(s);
            if(s.remove("Dhruthi")){
                s.add("Ratan");
            }
            System.out.println(s);
    }
}

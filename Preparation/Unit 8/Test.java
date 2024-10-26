import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("m");
        set.add("i");
        set.add("b");
        set.add("b");
        for (String x:set) System.out.println(x);
    }
}
import java.util.*;

public class main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 6; i++) {
            stack.push(i * i);
        }
        Iterator<Integer> iter;
        iter = stack.iterator();
        while (iter.hasNext()) {
            int nextElement = iter.next();
            System.out.print(nextElement + " ");
        }
    }
}
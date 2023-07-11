import java.util.*;

public class z41 {
    public static int dequeToInt(Deque<Integer> deque) {
        int num = 0;
        int place = 1;

        for(Integer i : deque) {
            num += i * place;
            place *= 10;
        }

        return num;
    }

    public static Deque<Integer> intToDeque(int num) {
        Deque<Integer> deque = new LinkedList<>();
        boolean isNegative = num < 0;

        if (isNegative) {
            num *= -1;
        }

        while(num > 0) {
            deque.addFirst(num % 10);
            num /= 10;
        }

        if (isNegative) {
            int first = deque.pollFirst();
            deque.addFirst(-first);
        }

        return deque;
    }

    public static Deque<Integer> multiply(Deque<Integer> a, Deque<Integer> b) {
        int numA = dequeToInt(a);
        int numB = dequeToInt(b);
        return intToDeque(numA * numB);
    }

    public static Deque<Integer> add(Deque<Integer> a, Deque<Integer> b) {
        int numA = dequeToInt(a);
        int numB = dequeToInt(b);
        return intToDeque(numA + numB);
    }

    public static void main(String[] args) {
        Deque<Integer> a = new LinkedList<>(Arrays.asList(-2, 3, 4));
        Deque<Integer> b = new LinkedList<>(Arrays.asList(5, 6, 7));
        System.out.println(multiply(a, b)); 
        System.out.println(add(a, b)); 
    }
}

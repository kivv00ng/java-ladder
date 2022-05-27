package nextstep.fp;

import java.util.List;

public class Lambda {
    public static void printAllOld(List<Integer> numbers) {
        System.out.println("printAllOld");

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printAllLambda(List<Integer> numbers) {
        System.out.println("printAllLambda");

        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        }).start();
    }

    public interface Conditional {
        boolean test(Integer number);
    }

    public static int sum(List<Integer>numbers, Conditional conditional){
        int total = 0;
        for (int number : numbers) {
            if(conditional.test(number))
                total += number;
        }
        return total;

    }
    public static int sumAll(List<Integer> numbers) {
        Conditional conditional = (number -> true);
        return sum(numbers, conditional);
    }

    public static int sumAllEven(List<Integer> numbers) {
        Conditional conditional = (number -> number%2==0);
        return sum(numbers, conditional);
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        Conditional conditional = (number -> number>3);
        return sum(numbers, conditional);
    }
}

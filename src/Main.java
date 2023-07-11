import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] numbers2 = {1.57, 7.654, 9.986};
        int[] numbers3 = {4, 5, 6, 7};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }

        double[] numbers2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i]);
            if (i < numbers2.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        int[] numbers3 = {4, 5, 6, 7};
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i]);
            if (i < numbers3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }

        double[] numbers2 = {1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i--) {
            System.out.print(numbers2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        int[] numbers3 = {4, 5, 6, 7};
        for (int i = 3; i >= 0; i--) {
            System.out.print(numbers3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
            } else {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}


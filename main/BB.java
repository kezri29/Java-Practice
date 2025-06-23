import java.util.*;

public class BadCode {
    public static void main(String args[]) {
        System.out.println("starting program");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int x = sc.nextInt();
        if (x > 0)
            for (int i = 0; i < x; i++)
                System.out.println("hi");
        else if (x < 0)
            System.out.println("negative");
        else
            System.out.println("zero");
        uselessFunction(5);
        anotherOne();
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void uselessFunction(int a) {
        a = a * 0;
        System.out.println("useless: " + a);
    }

    public static void anotherOne() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                if (i * j % 2 == 0) {
                    break;
                } else {
                    continue;
                }
            }
        }
    }
}

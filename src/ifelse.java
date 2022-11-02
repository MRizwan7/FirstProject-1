import java.util.Scanner;

public class ifelse {
   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter a number");

        int i = sc.nextInt();
        positiveornegative(i);
    }



    public static void testnunbers(int x) {
        x = 3;
        if (x % 2 == 0) {
            System.out.println("it is an even number");
        } else {
            System.out.println("its an odd number");
        }


    }

    public static void positiveornegative(int x) {
        if (x == 0) {
            System.out.println("neutral");
        } else if (x < 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }

    }
}
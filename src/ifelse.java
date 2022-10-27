public class ifelse {
    public static void main(String[] args) {
        

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
        if (x > 0) {
            System.out.println("positive");
            if (x == 0) {
                System.out.println("neutral");
            } else {
                System.out.println("negative");
            }
        }
    }}
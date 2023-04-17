import java.util.Scanner;

public class LabExer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sc.close();

        showNumberPlus18(num);
        showNumberPlus100(num);
        showNumberPlus168(num);
    }

    public static void showNumberPlus18(int num) {
        int result = num + 18;
        System.out.println(num + " plus 18 is " + result + ".");
    }

    public static void showNumberPlus100(int num) {
        int result = num + 166;
        System.out.println(num + " plus 166 is " + result + ".");
    }

    public static void showNumberPlus168(int num) {
        int result = num + 1888;
        System.out.println(num + " plus 1888 is " + result + ".");
    }
}

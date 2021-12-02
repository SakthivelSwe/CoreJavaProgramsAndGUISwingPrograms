import java.util.Scanner;

public class leapYear {
    // leap year find it
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("it is a leap year");
                } else {
                    System.out.println("it  is a not leap year");
                }
            } else {
                System.out.println("it is a leap year");
            }
        } else {
            System.out.println("it is not leap year");
        }
    }
}


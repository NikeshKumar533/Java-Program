import java.util.*;

public class week {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter week number(1-7): ");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("wednessday");
                break;
            case 5:
                System.out.println("Thresday");
                break;
            case 6:
                System.out.println("Frieday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
}
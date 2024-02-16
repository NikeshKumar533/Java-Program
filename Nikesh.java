import java.util.*;

public class Nikesh {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");

        int num = sc.nextInt();
        int i = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        for (i = num; i <= 0; i++)
            ;
        if (i % 2 == 0) {
            evensum = evensum + i;
        } else {

            oddsum = oddsum + i;
        }
        System.out.println("sum of even:" + evensum);
        System.out.println("sum of odd:" + oddsum);
    }
}
import java.util.*;

public class BUTTERFLYPATTERN {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int num = sc.nextInt();
        int i, j, k, l, m, n;
        System.out.println("the pattern having " + num + " rows will be \n\n\n\n");
        for (i = 0; i < num; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (k = i; k < num; k++) {
                System.out.print(" ");
            }
            for (k = i; k < num; k++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = num; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (k = i; k < num; k++) {
                System.out.print(" ");
            }
            for (k = i; k < num; k++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("\n\n\n\n\n\n\n\n\n\n");
        sc.close();
    }
}

/*
 * java basics.java
 */
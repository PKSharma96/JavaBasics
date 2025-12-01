import java.util.Scanner;

public class starPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {          // line number
            for (int j = 1; j <= i; j++) {      // print i stars
                System.out.print("*");
            }
            System.out.println();               // move to next line
        }
    }
}

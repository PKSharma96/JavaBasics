import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Input");

        int a = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        String s = sc.nextLine(); // For full line input
        
        System.out.println("After Input");
        System.out.println(a);
        System.out.println(s);
    }
}

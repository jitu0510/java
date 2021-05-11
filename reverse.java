
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            System.out.print(rem);
        }
    }

}

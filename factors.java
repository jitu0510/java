
import java.util.Scanner;


public class factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
                ++count;
            }
        }
        System.out.println();
        System.out.println("no. of factors= "+ count);

    }
}

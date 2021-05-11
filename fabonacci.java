
import java.util.Scanner;

public class fabonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t1=0,t2=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.print(sum + " ");
            t1=t2;
            t2=sum;
            sum=t1+t2;

        }
    }
}

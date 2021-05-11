import java.util.Scanner;
public class factorial {
    public static int find_factorial(int num){
        int fact=1;
        if(num==0){
            return 1;
        }else
        {
            for(int i=1;i<=num;i++){
                fact=fact*i;
            }return fact;
        }
    }
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(find_factorial(n));


    }
}

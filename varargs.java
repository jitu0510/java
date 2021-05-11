public class varargs{
    static int sum(int x,int...arr){
        int result=x;
        for(int a:arr){
            result+=a;
        }return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3,9,3));
    }
}
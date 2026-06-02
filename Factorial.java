public class Factorial {
    public static int fact(int n ){
        int temp =1;
        for(int i=1; i<=n; i++){
            temp = temp*i;
        }
    return temp ;
    }
    public static void main(String[] args) {
        System.out.println("Factorial is:" + fact(5));
    }
    
}

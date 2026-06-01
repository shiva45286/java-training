
public class Student{
    public static int add(int a, int b){
        int res = a+b;
        return res;
    }
    public static void printDetails(int data){
        System.out.println(data);
    }
    
    public static void main(String[] args){
       printDetails(add(10,20));
       
        
        
    }
}
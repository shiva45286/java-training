// compile time polymorphism-method overloading
// public class Polymorphism {
//     public static void test(int a, int b){
//         System.out.println(a +b);

//     }
//     public static void test(int a, int b , int c){
//         System.out.println(a +b +c);
//     }
//     public static void main(String[] args) {
//         test(10, 20);
        
//     }
// }


//  polymorphism-run time polymorphism -overridingpublic class Polymorphism {

class A{
    void show(){
        System.out.println("A");
    }
}
class B extends A{
    void show(){
        System.out.println("B");
    }
}
public class Polymorphism{

   public static void main(String[] args) {
    B user1 = new B();
    user1.show();
       
        
    }
}

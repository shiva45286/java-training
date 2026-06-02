class Bank {
    void Passbook(){
        System.out.println("printing the details of passbook");
    }
}
class SBI extends Bank{
    void display(){
        System.out.println("SBI");
    }
}
  

public class Inheritence {
    public static void main(String[] args) {
        SBI user1 = new SBI();
        user1.display();
        user1.Passbook();
    }
}
        

     
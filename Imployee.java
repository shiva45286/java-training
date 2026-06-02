// whith constructor
class employee{
    String name;
    int ID;
    employee(String name , int ID){
        this.name=name;
        this.ID=ID;
       
    }
    void display(){
        System.out.println("employee detail:"+name  +ID);
    }


}
public class Imployee {
     public static void main(String[] args){
          employee c1= new employee("shivani",  6 );
        c1.display();
    
}
}

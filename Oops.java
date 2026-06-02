class Car{
    String color;
    int gears;
    Car(String color, int gears){
        this.color =color;
        this.gears=gears;
       
    }
    void display(){
        System.out.println("color:"+color +" gears :" +gears);
    }
}
public class Oops{
    public static void main(String[] args){
        Car c1= new Car("black",6 );
        c1.display();
       
        }
}


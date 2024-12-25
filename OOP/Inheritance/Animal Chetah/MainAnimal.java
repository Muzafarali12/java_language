class Animal{
public void move(){
System.out.println("Animal are good!");
}
}
class Cheetah extends Animal{
public void move(){
System.out.println("Cheetah is flexible animal.");
}
}
public class MainAnimal{
public static void main(String [] args){
Cheetah c = new Cheetah();
c.move();
}
}

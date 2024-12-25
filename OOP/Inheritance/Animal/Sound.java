class Animal{
public void makeSound(){
System.out.println("Animal can talk! ");
}
}
class Cat extends Animal{
public void makeSound(){
System.out.println("Miyao Miyaoo! ");
}
}
public class Sound{
public static void main(String [] args){
Cat c = new Cat();
c.makeSound();
}
}


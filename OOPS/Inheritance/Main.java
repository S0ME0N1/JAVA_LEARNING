import java.util.Scanner ;

public class Main{
      public static void main(String[] args){

            Scanner DogName = new Scanner(System.in);
            Animal myAnimal = new Animal();
            Dog myDog = new Dog();

            System.out.println("What's your dog name ? : ");

            myDog.name = DogName.nextLine();
            myAnimal.sound();
            myDog.sound();
            // DogName = Scanner.nextline();
            myDog.eat();
            myDog.bark();
      }
}

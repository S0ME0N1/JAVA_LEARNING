class Dog{

      String name ;

      Dog (){
            name = "Unknown" ;
      }

      void displayInfo(){

        System.out.println("Dog's name is : "+ name) ;
      }
}

public class Main{
      public static void main(String[] args){
            Dog myDog = new Dog();

            myDog.displayInfo();
      }
}

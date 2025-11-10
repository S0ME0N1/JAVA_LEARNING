public class Greeting{

    public void greet(String name, int age){
      System.out.println("Name : "+ name + ", Age : "+ age);
    }

    public static void main(String[] args){

      Greeting greeting = new Greeting();
      greeting.greet("Saurabh",28) ;

      // System.out.println(greeting.greet());
    }

}

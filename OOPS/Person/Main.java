public class Main{

    public static void main(String[] args){

          Person person = new Person("Some0ne",28);

          System.out.println("Name : "+ person.getName()+ "\nAge : "+ person.getAge());
          person.setName("Anonymous") ;
          person.setAge(999);
          System.out.println();
          System.out.println("Update Name : "+ person.getName()+ "\nUpdated Age : "+ person.getAge());
          System.out.println();
          person.setAge(-9);

    }

}

// Superclass
class Animal{
    String name ;
    void eat(){
        System.out.println(name+ " is eating.");
    }

    void sound(){
        System.out.println("Animal makes a sound.");
    }
}



//subclass
class Dog extends Animal {
    void bark(){
        System.out.println(name + " says woof!");
    }

    @Override
    void sound(){
        System.out.println("Dog barks.");
    }
}


class Puppy extends Dog{
      void weep(){
          System.out.println(name + " is weeping.");
      }
}

class Cat extends Animal{
      void meow(){
            System.out.println(name + " says meow!");
      }
}

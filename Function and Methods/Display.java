public class Display{
      public void show(int number){
        System.out.println("Number : "+number);
      }

      public void show(String name){
        System.out.println("Text : "+name);
      }

      public static void main(String[] args){

          Display display = new Display();

          display.show(10);
          display.show("Saurabh");
    }
}

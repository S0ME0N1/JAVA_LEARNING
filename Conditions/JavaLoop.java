public class JavaLoop{
    public static void main(String args[]){


// For Loop
        for (int i = 0 ; i <= 10 ; i ++ ){
          System.out.println("Number : "+ i);
        }

// While Loop
          int i = 0 ;
          System.out.println();
        while(i <= 10){
          System.out.println("WhileLoop : "+ i);
          i ++ ;
        }

// Do While
        i = 0 ;
        System.out.println();
        do {
          System.out.println("DoWhileLoop : "+ i);
          i ++ ;
          } while (i <= 10);

        System.out.println("Nested Loop Start !");
        for (i = 1 ; i <= 10 ; i ++ ){
            for (int j = 1 ; j <= 10 ; j ++ ){
                System.out.println(i *  j + "\t");
              }
            }
      System.out.println("Loop Complete !");
      }
  }

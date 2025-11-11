class MathOperation{
      int add(int a, int b){
          return a + b ;
      }

      int add(int a, int b, int c){
          return a+ b+ c ;
      }

      double add(double a, double b){
          return a + b ;
      }
}

public class Main{
      public static void main(String[] args){

          MathOperation  mathOperation = new MathOperation() ;
            System.out.println("Sum : " + mathOperation.add(1,2));
            System.out.println("Sum : " + mathOperation.add(1,2,3));
            System.out.println("Sum : " + mathOperation.add(1.5,2.3));
      }
}

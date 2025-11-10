public class Exception{

      public static void main(String[] args){

        int numberator = 10 ;
        int denominator = 0 ;

        try{

            int  result = numberator / denominator ;
            System.out.println("Result : "+ result);

        } catch (ArithmeticException e){
            System.out.println("Error: Cannot divide by zero");

        } finally {
            System.out.println("Finally block executed");
        }

      }
}

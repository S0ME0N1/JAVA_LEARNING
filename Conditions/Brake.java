public class Brake{
    public static void main(String args[]){

      int[] numbers = {1,2 ,3,4,5,6,7,8,9,0};

      for (int num : numbers){
        if (num > 3 ){
          System.out.println("First number greater than 3 is : "+ num);
          break;
        }
      }
    }
}

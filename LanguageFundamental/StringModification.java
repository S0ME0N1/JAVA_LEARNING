public class StringModification{
    public static void main(String args[]){

      String Name = "Saurabh";

      // length() and charAt
      for (int i = 0 ; i <= Name.length() - 1 ; i++){
        System.out.println(Name.charAt(i));
      }


      //Concate

      String FName = "Saurabh";
      String LName = "Prajapati" ;

      String FullName1 = FName + " " + LName ;
      System.out.println(FullName1) ;
      String FullName = FName.concat(" ").concat(LName);
      System.out.println(FullName) ;


      // String Comparision

      String Str1 = "Sample1" ;
      String Str2 = "Sample2" ;
      String Str3 = "Sample1" ;

        System.out.println(Str1.equals(Str3));
        System.out.println(Str1.equals(Str2));


      //SubStrings

      String Str4 = "Java Programming" ;
      String sub = Str4.substring(5,16) ;
        System.out.println(sub);

      // String Split

      String csv = "apple, banana, cherry" ;
      String[] fruites = csv.split(",") ;

        for (String fruit : fruites ){
            System.out.println(fruit) ;
        }

    //Join String

    String[] Colours = {"Red","Blue","Yellow"};
    String joinedcolors = String.join(",", Colours);


      System.out.println(joinedcolors) ;

    // Upper and Lower Case
    String Greet = "hello world!";
      System.out.println(Greet.toUpperCase()) ;
      System.out.println(Greet.toLowerCase()) ;

    String s1 = "The quick brown fox jumped over the lazy dog";

      System.out.println(s1.length());

        char[] strAsArr = s1.toCharArray();
        System.out.println(strAsArr.length);

        System.out.println(strAsArr);

        System.out.println("The first char of the string is " + strAsArr[0]);
        System.out.println("The last char of the string is " + strAsArr[strAsArr.length-1]);

        System.out.println("The index of T is " + s1.indexOf('T'));
        System.out.println("The index of g is " + s1.indexOf('g'));

/**
    //trim()
    // replace ("old word","new word")
    .equals - Returns true if the content of two Strings are exactly the same including the leading and trailing space.
    .equalsIgnoreCase - Returns true ignoring the case of the two Strings. But the characters have to be in the same
                        positions in both Strings and should not have any leading and trailing spaces.
    .strip() - Removes the leading and trailing white spaces. This is extremely useful when dealing with data.
    .matches()

    String regexStr = "^W.*";
    s1.matches(regexStr)) -
    ^W.* - matches all Strings that start with uppercase W followed by any characeters or any length.


**/

  }

}



public class Lab00 {

   public static void main(String[] args) {

      //declare variables

      int x = 5;
      String y = "hello ";
      double z = 9.8;

      //print variables

      System.out.println("x: " + x + "y: " + y + "z: " + z);

      //declare array

      int[] nums = {3, 6, -1, 2};

      for (int i = 0; i < nums.length; i++) {
         System.out.println(nums[i]);
      }

      //call a function in java


      int numFound = char_count(y, 'l');
      System.out.println("you found:"+ numFound);

      //count and print a for loop from 1 to 10


      int lowerBound = 1;
      int upperBound = 10;
      for (int i = lowerBound; i <= upperBound; i++){
         System.out.print(i + " ");

      }

   }


   //character count function
   public static int char_count(String s, char c) {
      int count = 0;
      for (int i = 0; i < s.length(); i++) {
         if (s.charAt(i) == c) {
            count++;
            //charAt locates a character in a string in Java

         }
      }
      return count;
   }
}

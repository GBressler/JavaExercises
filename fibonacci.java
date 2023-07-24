public class Main {
  public static void main(String[] args) {
      //fibonnachi 1 1 2 3 5 8 13

      int number = 0;
      int nextNumber = 1;
      int sum = 0;

      //loop for each number in the 7 number sequence
      for(int i = 0; i < 6; i++){
         
         //we are going to add 2 numbers and keep track of the sum
         //in the first iteration we set the sum to 1
         sum = number + nextNumber; 

         //set the next number to the original
         //resets nextNumbe to 0 in the first iteration allowing for the two 1's at the beginning of the sequence
         nextNumber = number;
         
         //set the number equal to the sum
         //this will be 1 in first & second iteration
         number = sum;
         System.out.println(number);
      }
  }
}
public class PalindromeNumber {

    // check if the given integer is palindrome - two pointer technique
    public static boolean isPalindrome(int number) {

        // convert number to string for character comparison
        String numberString = Integer.toString(number);
        // initialize two pointer , one at start and the other one at end
        int leftIndex = 0;
        int rightIndex = numberString.length() - 1;
        //loop until pointer meet in the middle
        while (leftIndex < rightIndex) {
            //get characters at the current position
            char leftChar = numberString.charAt(leftIndex);
            char rightChar = numberString.charAt(rightIndex);
            // if the characters does not match it is not palindrome
            if (leftChar != rightChar) {
                return false;
            }
            // move the pointers closer to the center
            leftIndex++;
            rightIndex--;
        }
        // if all characters matched, it is palindrome
        return true;
    }


/*
    // checking using mathematical
  public static boolean isPalindrome(int num){
  int original=num; // store original number to compare later
  int reversed=0; // it will hold the reversed number

  //process the number digit by digit from the end
  while(num>0){
  int digit=num%10; // get the last digit
  reversed=reversed*10+digit; // append the digit to reversed number
  num/=10; // remove last digit from num
  }
  return original==reversed;

  }
*/

/*
* checking if a given string is palindrome or not
* 
* public boolean isPalindrome(String inputString){
* char[] charArray=inputString.toCharArray();
* int leftIndex=0;
* int rightIndex=inputString.length()-1;
* while(leftIndex<rightIndex){
* if(charArray[leftIndex]!=charArray[rightIndex]){
* return false;
* }
* leftIndex++;
* rightIndex--;
* }
* return true;
* }
* 
 */

    public static void main(String[] args) {

        int numberCheck = 12321;
        if (isPalindrome(numberCheck)) {
            System.out.println(numberCheck + " is a palindrome");
        } else {
            System.out.println(numberCheck + "is not palindrome");
        }
    }

}



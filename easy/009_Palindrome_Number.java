class Solution {
  /* The problem to solve in this is to decipher if the given integer is a palindrome or not
    it is a palindrome if you achieve the same result when you read the number backwards and forwards. Be wary when its an odd number..
    account for that.

Step 1: We think of all possiblilites that will hinder its chances of being a palindrome.
... if its less than zero or if its a number that ends with a 0, it cant be palindrome, bc a number cant start with zero unless its
        zero itself.
Step 2:
 We use a while loop to get the second half of the integer..
 once the second half acquired becomes greater or equal to x(slowly decreasing), we stop.



 Step 3:
return true If the secondhalf of the inital number is equal to the new updated x or secondhalf/10(to account for if secondhalf > x when odd) is equal to x

 Step 4:


    */





    public boolean isPalindrome(int x) {

        if(x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }



        int revertedNumber = 0;


        while(x > revertedNumber) {
            revertedNumber = revertedNumber*10 + x % 10; //remember to account for the single/tens/hundredths places
            x /= 10;

        }

        return  (x == revertedNumber || x == revertedNumber/10);




    }
}








//Special cases are when the values is negative, less than 0 and
//    //When the value ends with a zero, it must be 0 because 00 is not a value.
//    //
//         if(x < 0 || (x % 10 == 0 && x != 0)) {
//               return false;
//         }


//   // we will create a reverted variable. As we add to this variable we will take away from the variable x       //integer, being the palindrome

//         int revertedNumber = 0;
//         //12321
//         while(revertedNumber < x) {

//             revertedNumber = revertedNumber*10 + x % 10;  // 1 ,12,123
//             x /= 10;                      //1232 ,123,12
//         }




//         return x == revertedNumber ||  x == revertedNumber / 10;     //we divide by 10 to deal with the odd numbers.


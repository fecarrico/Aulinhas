public class PalindromeLeetCode {
    public static String main(String[] args){


//        Given an integer x, return true if x is a
//                palindrome
//, and false otherwise.
//
//
//
//                Example 1:
//
//        Input: x = 121
//        Output: true
//        Explanation: 121 reads as 121 from left to right and from right to left.
//                Example 2:
//
//        Input: x = -121
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//        Example 3:
//
//        Input: x = 10
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

        int x;



        boolean palindrome = false;
        int[] y = Integer.toString(x).chars().toArray();

        if (y.length == 2 || x <= -1){

            palindrome = false;
            return palindrome;

        }
        if (y.length == 1 || x == 0){
            palindrome = true;
            return palindrome;

        } else {

            int right = 0;
            int left = y.length - 1;
            boolean iguais = false;

            for (int i = right; right < left; i++) {
                if (y[right] == y[left]) {
                    right++;
                    left--;
                    iguais = true;
                } else {
                    iguais = false;
                    break;
                }
            }
            if (iguais) {
                palindrome = true;
            }
        }
        return palindrome;



    }
}

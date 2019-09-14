/*
7. Reverse Integer
Easy

2431

3777

Favorite

Share
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

class reverseInt {
    public int reverse(int x) {
        //int j= x;
        long inv = 0; // why can't this be int?

// to make negative reverse faster, tradeoff more storage used.
        int negative = 1;
        if (x < 0){
            negative = -1;
            x *= -1;
        }

        while (x != 0) {
            inv = inv*10 + (x%10);
            x = x/10;
        }
        //try to remember how to check if a number is within 32-bit signed int.
        if (inv*negative > Integer.MAX_VALUE || inv*negative <= Integer.MIN_VALUE) {
           return 0;
        }
        return (int)inv*negative;
    }
}

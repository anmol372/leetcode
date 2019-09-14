/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/


/*
1st : Brute force
T=O(n^2)
S=O(1)
~~~~~~~~~~~~~~~~~~~

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("NO Solution Found");
      }
  }

/*When Arguments out of range. For example, the percentage should lie between 1 to 100. If the user entered 101 then an IllegalArugmentExcpetion will be thrown.
When arguments format is invalid. For example, if our method requires date format like YYYY/MM/DD but if the user is passing YYYY-MM-DD. Then our method can’t understand then IllegalArugmentExcpetion will be thrown.
When a method needs non-empty string as a parameter but the null string is passed.

*/

class twoSum {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (numbers.containsKey(j)){
                return new int[] {numbers.get(j), i};
            }
            numbers.put(nums[i],i);
        }
        //System.out.println("numbers " + numbers);
        throw new IllegalArgumentException("No Solution Found");
    }
}

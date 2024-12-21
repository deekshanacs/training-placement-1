21.12.2024

Leetcode
Day-1

Pg-1

public class Solution {
    public int romanToInt(String s) {

        int[] romanValues = new int[128];
        romanValues['I'] = 1;
        romanValues['V'] = 5;
        romanValues['X'] = 10;
        romanValues['L'] = 50;
        romanValues['C'] = 100;
        romanValues['D'] = 500;
        romanValues['M'] = 1000;

        int result = 0;
        int n = s.length();
 
        for (int i = 0; i < n; i++) {

            if (i < n - 1 && romanValues[s.charAt(i)] < romanValues[s.charAt(i + 1)]) {
                result -= romanValues[s.charAt(i)];
            } else {
                result += romanValues[s.charAt(i)];
            }
        }
        
        return result;
    }
}



Pg-2


public class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        String str = Integer.toString(x);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}


Pg-3

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];
            if (map.containsKey(complement)) {

                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
}

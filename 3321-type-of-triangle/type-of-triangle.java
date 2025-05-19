import java.util.Arrays;

class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        
        // Check for triangle inequality violation
        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        }
        
        int side1 = nums[0];
        int side2 = nums[1];
        int side3 = nums[2];
        
        if (side1 == side2 && side2 == side3) {
            return "equilateral";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}

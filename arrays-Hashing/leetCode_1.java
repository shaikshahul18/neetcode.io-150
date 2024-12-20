import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetCode_1 {
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> numMap = new HashMap<>();
        int n = nums.length;
        for (int i=0; i<n;i++){
            int complement = target - nums[i];
            if (numMap.containsKey(complement)){
                return new int[] {numMap.get(complement), i};
            }
            numMap.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        leetCode_1 solution = new leetCode_1();
        int []nums = {2,7,9,11};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("The indexes are: "+Arrays.toString(result));
    }
}

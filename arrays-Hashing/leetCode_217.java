import java.util.HashSet;

public class leetCode_217 {
    public boolean containsDuplicates(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for (int i : nums){
            if (seen.contains(i)){
                return true;
            }
            seen.add(i);
        }
        return false;
    }
    public static void main(String[] args){
        leetCode_217 solution = new leetCode_217();
        int[] nums = {1, 2, 3, 4, 5, 1};
        boolean result = solution.containsDuplicates(nums);
        System.out.println("Contains duplicates: " + result);
    }
}
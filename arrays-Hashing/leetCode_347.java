import java.util.*;

public class leetCode_347 {
    public int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length;i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }   
        arr.sort((a,b) -> b[0] - a[0]);
        int[] res = new int[k];
        for(int i =0; i < k;i++){
            res[i] = arr.get(i)[1];
        }
        return res;
    }

    public static void main(String[] args) {
        leetCode_347 sol = new leetCode_347();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] res = sol.topKFrequent(nums, k);
        System.out.println("The result is : " + Arrays.toString(res));
    }
}

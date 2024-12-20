import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class leetCode_49 {
    public List<List<String>> groupAnagrams (String[] strs){
        Map<String, List<String>> wordMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            char[] array = strs[i].toCharArray();
            Arrays.sort(array);
            String str = new String(array);
            if (!wordMap.containsKey(str)){
                wordMap.put(str, new ArrayList<>());
            }
            wordMap.get(str).add(strs[i]);
        }
        return new ArrayList<>(wordMap.values());
    }

    public static void main(String[] args) {
        leetCode_49 solution = new leetCode_49();
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = solution.groupAnagrams(strings);
        System.out.println("The result is :" + result);
    }
}

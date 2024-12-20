import java.util.HashMap;
import java.util.Map;

public class leetCode_242 {
    public boolean isAnagram(String s, String t){
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char x : t.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) - 1);
        }
        for (int val : map.values()){
            if (val != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        leetCode_242 solution = new leetCode_242();
        String s = "anagram";
        String t = "nagaram";
        boolean result = solution.isAnagram(s, t);
        System.out.println("Is anagram: " + result);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, Integer> map = new HashMap<>();
        List<List<String>> items = new ArrayList<>();
        int k = 0;
        for(int index = 0; index < strs.length; index ++) {
            char[] strChars = strs[index].toCharArray();
            Arrays.sort(strChars);
            String key = new String(strChars);

            if (map.get(key) != null) {
                int n = map.get(key);
                List<String> item = items.get(n);
                item.add(strs[index]);
                items.set(n, item);
            } else {
                map.put(key, k++);
                ArrayList<String> item = new ArrayList<>();
                item.add(strs[index]);
                items.add(item);
            }

        }
        return items;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));
    }
}

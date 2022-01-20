import java.util.*;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned){
        List<String> words = new ArrayList<>(
                Arrays.asList(
                        paragraph.toLowerCase()
                                .replaceAll("[^a-zA-Z0-9]+", " ")
                                .split(" ")));
        words.removeAll(Arrays.asList(banned));


        Map<String, Integer> map = new HashMap<>();
        for(String str : words){
            map.put(str, map.getOrDefault(str,0)+1);
        }

        int max = 0;
        for(String word : map.keySet()){
            max = Math.max(max, map.get(word));
        }

        for(String word : map.keySet()){
            if(map.get(word) == max){
                return word;
            }
        }
        return words.toString();
    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        System.out.println(mostCommonWord(paragraph,banned));
    }
}

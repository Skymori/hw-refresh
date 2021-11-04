package hw9.tasks.task3;

import java.util.*;

public class Creator {
    public static List<Map.Entry<String,Integer>> createWordToArray(String[] parts){
        Map<String, Integer> wordsCount = new HashMap<>();
        Set<String> wordSet = new HashSet<>();
        List<String> allWords = new ArrayList<>(Arrays.asList(parts));
        for (String part: parts){
            if (!wordSet.contains(part)){
                wordSet.add(part);
                wordsCount.put(part,Collections.frequency(allWords,part));
            }
        }
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(wordsCount.entrySet());
        entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        return entryList;
    }
}

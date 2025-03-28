package listinterface;

import java.util.*;


public class FrequencyCounter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        TreeMap<String,Integer>mp=new TreeMap<>();
        for(int i=0;i<words.size();i++){
            mp.put(words.get(i),mp.getOrDefault(words.get(i),0)+1);

        }
        System.out.println(mp);
    }
}


package listinterface;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<numbers.size();i++){
            if(mp.containsKey(numbers.get(i))){
                mp.put(numbers.get(i),mp.get(numbers.get(i))+1);
            }
            else{
                mp.put(numbers.get(i),1);
            }

        }
        for(int e : mp.keySet()){
            System.out.println(e);
        }
    }
}

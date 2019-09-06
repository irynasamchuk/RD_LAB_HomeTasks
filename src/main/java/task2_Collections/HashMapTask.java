package task2_Collections;

import java.util.HashMap;

public class HashMapTask {
    public static void main(String[] args) {
        HashMap<String, Integer> resultHashMap = HashMapTask.newHashMap("Hello here!");
        System.out.println(resultHashMap);
    }
    public static HashMap<String, Integer> newHashMap(String sentence){
        HashMap<Integer, String> myHashMap = new HashMap();
        for(int i = 0; i < sentence.length(); i++){
            myHashMap.put(i, sentence.substring(i, i+1));
        }
        HashMap <String, Integer> tempHashMap = new HashMap<>();
        for(String i : myHashMap.values()){
            if(tempHashMap.keySet().contains(i)){
                tempHashMap.put(i, tempHashMap.get(i)+1);
            }else
                tempHashMap.put(i,1);
        }
        return tempHashMap;
    }
}

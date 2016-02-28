package io.hedwig.interviews.charactercounter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by patrick on 16/2/28.
 */
public class CharacterCounters {

    public Map<String,Integer> countCharacters(String source){
        char[] chars = source.toCharArray();
        Map<String,Integer> result = new HashMap<>();

        for (char aChar : chars) {
            Integer existing_counter = result.get(String.valueOf(aChar));
            int counter =  existing_counter==null?0:existing_counter;
            result.put(String.valueOf(aChar),counter+1);
        }
        return result;
    }

    public Map<String,Integer> countCharacters_JAVA8(String source){
        char[] chars = source.toCharArray();
        Map<String,Integer> result = new HashMap<>();
        for (char aChar : chars) {
            result.put(String.valueOf(aChar),result.getOrDefault(String.valueOf(aChar),0)+1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new CharacterCounters().countCharacters("MIssissippi"));
        System.out.println(new CharacterCounters().countCharacters_JAVA8("MIssissippi"));
    }
}

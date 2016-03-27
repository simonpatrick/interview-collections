package io.hedwig.interviews.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by patrick on 16/3/21.
 */
public class SimpleDFA {

    private void addSensitiveWord(Set<String> words){
        Map<String,String> sensitiveWordMap = new HashMap<>(words.size());
        for (String word : words) {
            for (int i = 0; i <word.length() ; i++) {
                char keyChar = word.charAt(i);

            }
        }
    }
}

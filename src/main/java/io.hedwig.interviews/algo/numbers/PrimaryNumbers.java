package io.hedwig.interviews.algo.numbers;

import java.util.ArrayList;

/**
 * Created by patrick on 16/4/19.
 */
public class PrimaryNumbers {

    public long primaryNumberMultiple(int bound){
        ArrayList<Integer> a = new ArrayList<Integer>(); a.add(2);
        for (int i = 3; i <= 100000; i += 2) {
            int j;
            for (j = 3; j <= Math.sqrt(i); j++) {
                if (i % j == 0) break;
            }
            if (j > Math.sqrt(i)) {
                a.add(i); }
        }
        int s = 1;
        for (int i = 0; i < bound; i++) {
            s = (s * a.get(i)) % 50000;
        }
        return s;
    }

}

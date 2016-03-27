package io.hedwig.interviews.removeduplicate;

/**
 * Created by patrick on 16/3/27.
 */
public class RemoveDuplication {

    public static void main(String[] args) {
        String dup = "ab   c  d e f   d ";
        char[] chars = dup.toCharArray();
        char dupToken = ' ';
        int size = chars.length;
        for (int i = 0; i <size-1 ; i++) {
            if(chars[i]==dupToken){
                while(chars[i+1]==dupToken){
                    for (int j = i+1; j <chars.length-1 ; j++) {
                        chars[j]=chars[j+1];
                    }
                    chars[chars.length-1]=' ';
                    size-=1;
                }
            }
        }
        System.out.println(chars);
        System.out.println(size);
    }
}

package io.hedwig.interviews.algo.numbers;

/**
 * Created by patrick on 16/4/19.
 * 先举个栗子——我们是怎么把111(10进制)转换为157(8进制)的呢，其实就是一般的除法。
 1. 比111小的最大的8的幂次是64
 2. 111 / 64 = 1 ... 47
 3. 47 / 8 = 5 ... 7
 4. 7 / 1 = 7 ... 0
 把3次除法的商连起来就是157(8进制)

 算法上的思路跟这个完全一样（如果下面这段看着难受请直接看代码）
 1. 假设要被转换的10进制数是num，进制是base，转换结果是result
 2. 找到比num小的最大的base^n
 3. result的第i位为num / base^(n-i)的商
 4. num = num % base^(n-i)，即余数作为下一轮的被除数
 5. i++并回到第3部除非除数等于0
 */
public class HexOctDecBinary {

    //T[n] = a[0]*base^(n-1) + a[1]*base^(n-2) + ... + a[n-2]*base + a[n-1]
    public static String itos(int num, int base) {
        int divisor = 1;
        byte[] table = "0123456789ABCDEF".getBytes();
        String result = "";
        while (divisor * base <= num) {
            divisor *= base;
        }
        for (; divisor >= 1; divisor /= base) {
            result += (char) table[num/divisor];
            num %= divisor;
        }
        return result;
    }

    // Java 12(10进制) <=> C(16进制) <=> 1100(2进制) <=> 14(8进制)
    public static int stoi(String src, int base) {
        int digit, result = 0;
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (c >= 'a') {
                digit = c - 'a' + 10;
            } else if (c >= 'A') {
                digit = c - 'A' + 10;
            } else {
                digit = c - '0';
            }
            result = base*result + digit;
        }
        return result;
    }

    public static void main(String[] args) {
//        //十进制转成十六进制：
//        Integer.toHexString(int i)
//        //十进制转成八进制
//        Integer.toOctalString(int i)
//        //十进制转成二进制
//        Integer.toBinaryString(int i)
//        十六进制转成十进制
//        Integer.valueOf("FFFF",16).toString()
//        八进制转成十进制
//        Integer.valueOf("876",8).toString()
//        二进制转十进制
//        Integer.valueOf("0101",2).toString()
    }
}

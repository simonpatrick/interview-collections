package io.hedwig.interviews.algo.numbers;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by patrick on 16/4/19.
 * 已知一个正整数N,问从1~N中任选出三个数,他们的最小公倍数最大可以为多少
 */
public class MaxLeaseCommonMultiple {

    /**
     * 大于1的相邻自然数必互质
     * Think about if 任选N个数,最小公倍数最大.......
     * 2,3 很好理解- 2的话就是n*n-1
     * 3 的话
     */
//    public static long maxLowestCommonMultiple(int n){
//        //n,n-1 n-2
//        if(n<=0) throw new RuntimeException("please input bigger than zero");
//        if (n%2!=0){
//            return n*(n-1)*(n-2);
//        }else{
//            if (n%3==0){
//                return (n-1)*(n-2)*(n-3);
//            }else{
//                return n*(n-1)*(n-3);
//            }
//        }
//    }

    public List<Integer> leaseCommonMultiple(int a,int b,int...c){
     //分解,合并素数
        List<Integer> result = Lists.newArrayList();
        result.addAll(primeSplit(a));
        result.addAll(primeSplit(b));
        for (int i : c) {
            result.addAll(primeSplit(i));
        }

        return result;
    }

    public List<Integer> primeSplit(int x){
        int k = 2;
        if(x<=1){
            throw new RuntimeException(x+"不能被分解");
        }

        if(x==2){
            return Lists.newArrayList(1,2);
        }
        List<Integer> result = Lists.newArrayList();
        while(k<=x){
            if(x%k==0){
                result.add(k);
                x=x/k;
            }else{
                k++;
            }
        }
        return result;
    }
}

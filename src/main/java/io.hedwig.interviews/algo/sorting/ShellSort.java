package io.hedwig.interviews.algo.sorting;

public class ShellSort {
    public static void main(String[] args) {
        int source[] = new int[]{49, 38, 65, 97, 76, 13, 27, 49, 55, 4, 6};
        System.out.print("排序前:\t");
        printArray(source);
        shellSort(source);
        System.out.print("排序后:\t");
        printArray(source);
    }

    private static void shellSort(int[] source) {
        int j;
        for (int gap = source.length / 2; gap > 0; gap /= 2) { // gap 为增长序列,递减至1【亦可自定义增长 序列】
            for (int i = gap; i < source.length; i++) { // 【直接插入排序】,从第一个gap处向后移,直至移到最 后一个数
                int temp = source[i];// 当前gap处的值
                for (j = i; j >= gap && temp < source[j - gap]; ) {// 最后一个数如果是第一个gap的倍数,按理应 第一次循环,但却最后循环
                    source[j] = source[j - gap]; // 较大数往后移
                    j -= gap; // 亦可放在循环体内 }
                    source[j] = temp; // 跳出循环意味着temp的位置已确定 }
                    System.out.print("增长序列" + gap + ": ");
                    printArray(source);
                }
            }
        }
    }

    private static void printArray(int[] source) {
        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i] + ",");
        }
        System.out.println();
    }
}

package com.testing.class8;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] input={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        System.out.println("input原始数据为：");
        for (int i:input){
            System.out.print(i+" ");
        }
        System.out.println();
        input=BubbleSort(input);
        System.out.println("冒泡排序_内层降序排序结果为：");
        for (int i:input){
            System.out.print(i+" ");
        }
        System.out.println();

        input=BubbleSortDes(input);
        System.out.println("冒泡排序_内外层降序排序结果为：");
        for (int i:input){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //冒泡排序，降序
    // 从最后一个元素开始排列
    public static int[] BubbleSort(int[] a){
//        外层排序，轮
        for (int lun=0;lun<a.length-1;lun++){
            for (int index=a.length-1;index>lun;index--){
                //如果这个数比后面的数大，则进行交换
                if (a[index]>a[index-1]){
                    int tmp = a[index];
                    a[index] = a[index - 1];
                    a[index - 1] = tmp;
                }
            }
        }
        return a;
    }

    //内外层都降序
    public static int[] BubbleSortDes(int[] a){
        for (int lun=a.length-1;lun>0;lun--){
            for (int index=a.length-1;index>0;index--){
                //如果这个数比后面的数大，则进行交换
                if (a[index]>a[index-1]){
                    int tmp = a[index];
                    a[index] = a[index - 1];
                    a[index - 1] = tmp;
                }
            }
        }
        return a;
    }
}

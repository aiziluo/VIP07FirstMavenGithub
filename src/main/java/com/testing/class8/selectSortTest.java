package com.testing.class8;

public class selectSortTest {
    public static void main(String[] args) {
        int[] input={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        System.out.println("input原始数据为：");
        for (int i:input){
            System.out.print(i+" ");
        }
        System.out.println();

        //调用从最后一个元素降序排序
        System.out.println("选择排序_降序结果为：");
        input=selectSort(input);
        for (int i:input){
            System.out.print(i+" ");
        }
        System.out.println();

    }

    public static int[] selectSort(int[] a){
        //外层循环
        for (int lun=a.length-1;lun>0;lun--){
            int min=a[lun];
            int mini=lun;
            for (int index=lun-1;index>=0;index--){
                if (a[index] < min){
                    min = a[index];
                    mini = index;
                }
            }
            if (min != a[lun]){
                a[mini] = a[lun];
                a[lun] = min;
            }
        }
        return a;
    }
}

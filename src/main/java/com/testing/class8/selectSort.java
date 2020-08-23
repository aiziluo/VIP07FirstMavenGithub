package com.testing.class8;

public class selectSort {
    public static void main(String[] args) {
        int[] input={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        System.out.println("input原始数据为：");
        for (int i:input){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("选择排序_升序结果为：");
        input=selectSort(input);
        for (int i:input){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("选择排序_降序结果为：");
        input=selectSort2(input);
        for (int i:input){
            System.out.print(i+" ");
        }
        System.out.println();

    }


    public static int[] selectSort(int[] a) {
        for (int lun = 0; lun < a.length - 1; lun++) {
            //创建变量记录最小值及其位置
            int min = a[lun];
            int mini = lun;
            for (int index = lun + 1; index < a.length; index++) {
                if (a[mini] > a[index]) {
                    min = a[index];
                    mini = index;
                }
            }
            if (min != a[lun]) {
                a[mini] = a[lun];
                a[lun] = min;
            }
        }

        return a;
    }

    public static int[] selectSort2(int[] a) {
        for (int lun = 0; lun < a.length - 1; lun++) {
            int max = a[lun];
            int maxl = lun;
            for (int index = lun + 1; index < a.length; index++) {
                if (a[maxl] < a[index]) {
                    max = a[index];
                    maxl = index;
                }
            }
            if (max != a[lun]) {
                a[maxl] = a[lun];
                a[lun] = max;
            }
        }
        return a;
    }
}
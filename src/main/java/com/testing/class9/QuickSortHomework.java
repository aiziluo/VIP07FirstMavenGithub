package com.testing.class9;

public class QuickSortHomework {
    public static void main(String[] args) {
        int[] input = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("input原始数据为：");
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
        input=quickSort(input,input.length-1,0);
        System.out.println("input快速排序后数据为：");
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] quickSort(int[] Arr,int star,int end){
        //记录排序元素的起始位置
        int right=star;
        int left=end;
        //取最后一个元素为基准值
        int base=Arr[right];
        //外层循环，左边下标比右边下标小时执行，左边下标=右边下标时结束
        while (left<right) {
            //从左到右遍历
            while (left<right){
                if (Arr[left]<base){
                    left++;
                }else {
                    int tmp=Arr[right];
                    Arr[right]=Arr[left];
                    Arr[left]=tmp;
                    right--;
                    break;
                }
            }
            //从右到左遍历
            while (left<right){
                if (Arr[right]>base){
                    right--;
                }else {
                    int tmp=Arr[right];
                    Arr[right]=Arr[left];
                    Arr[left]=tmp;
                    left++;
                    break;
                }
            }
        }
        //递归出口
        //排左边
        if (end >= left - 1) {
        } else {
            quickSort(Arr, left - 1, end);
        }
        //递归出口
        //排右边
        if (right + 1 >= star) {
        } else {
            quickSort(Arr, star, right + 1);
        }
        return Arr;
    }
}

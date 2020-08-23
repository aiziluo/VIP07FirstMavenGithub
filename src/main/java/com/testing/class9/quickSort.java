package com.testing.class9;

public class quickSort {
    public static void main(String[] args) {
        int[] input = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("input原始数据为：");
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
        input=quickSort(input,0,input.length-1);
        System.out.println("input快速排序后数据为：");
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] quickSort(int[] input,int low,int high){
        //==============================核心算法===================
        //1、确定取左边一个下标left遍历起点  low ，右边一个下标right遍历起点 high
        int left=low;
        int right=high;
        //2、选最左边的元素为基准元素。 最开始基准值的位置就是left
        int base=input[left];
        //3、外层循环，直到左右遍历相遇
        while (left<right){
            //4、从右往左进行遍历
            while (left<right){
                //如果当前right下标的值大于基准值，right--;
                if (input[right] > base){
                    right--;
                }
                //如果当前right下标的值小于基准值，则交换基准值(下标为left)和right位置的值。基准值的下标是right;
                else {
                    int tmp = input[left];
                    input[left] = input[right];
                    input[right] = tmp;
                    //	left++;
                    left++;
                    //	切换为从左往右的遍历。
                    break;
                }
            }
            //5、从左往右进行遍历
            while (left<right){
                if (input[left] < base){
                    left++;
                }
                //如果当前left下标的值大于基准值，则和基准值当前所在位置(right)进行交换。基准值的下标变成left；
                else {
                    int tmp = input[left];
                    input[left] = input[right];
                    input[right] = tmp;
                    //	right--
                    right--;
                    //	切换为从右往左的遍历。
                    break;
                }
            }

        }
        //==============================递归调用==================
        //递归出口
        //排左边
        if (low>=left-1){
            //啥都不做
        }else {
            quickSort(input,low,left-1);
        }

        //排右边
        //递归出口
        if (right+1>=high){
            //啥都不做
        }else {
            quickSort(input,right+1,high);
        }
        return input;
    }
}



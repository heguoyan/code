package sort;

import java.util.Arrays;

/**
 * Created by JasonHe on 2018/8/15.
 * 冒泡排序
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 */
public class BubbleSort {

    static int[] bubbleSort(int []a){

        for(int i=1;i<a.length;i++){
            boolean flag = true;
            for(int j=1;j<a.length;j++){
                if(a[j]<a[j-1]){
                    flag = false;
                    swap(a,j-1,j);
                }
            }
            if(flag){
                break;
            }
            System.out.println(Arrays.toString(a));
        }
        return a;
    }

    static int[] swap(int []a,int start,int end){
        int tmp = a[start];
        a[start] = a[end];
        a[end] = tmp;
        return a;
    }

    public static void main(String[] args) {
//        int []a = {1,2,8,4,5};
        int []a ={10,20,15,0,6,7,2,1,-5,55};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
